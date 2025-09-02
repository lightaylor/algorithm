# Algorithm Problem Solving

## 📌 Overview
This repository is dedicated to **Algorithm Problem Solving** and includes a **Commit Lint** setup to maintain a consistent Git commit message style.


## 🔧 Commit Lint Local Setting

Use the `.gitmessage` file and Git Hooks to apply a commit message template and enforce commit message validation.

```bash
# Set commit template
git config --global commit.template ./githook/.gitmessage

# Set Git hooks path
git config core.hooksPath ./githook

# Grant execute permission to the commit-msg hook
chmod +x githook/commit-msg
```
With this setup, every commit will follow predefined message rules.


## 📁 Project Structure
```bash
.
├── githook/
│   ├── commit-msg        # Commit message validation script
│   └── .gitmessage       # Commit message template
└── src/
    └── ...               # Algorithm problem-solving code
```
