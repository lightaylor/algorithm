package programmers.pcce.data_analysis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Function<Data, Integer>> extractor = Map.of(
            "code",    Data::code,
            "date",    Data::date,
            "maximum", Data::maximum,
            "remain",  Data::remain
        );

        List<Data> list = new ArrayList<>();
        for (int[] d : data) list.add(new Data(d[0], d[1], d[2], d[3]));

        list.removeIf(d -> extractor.get(ext).apply(d) >= val_ext);
        list.sort(Comparator.comparingInt(d -> extractor.get(sort_by).apply(d)));

        return list.stream()
            .map(d -> new int[]{d.code(), d.date(), d.maximum(), d.remain()})
            .toArray(int[][]::new);
    }
}

class Data {
    private final int code;
    private final int date;
    private final int maximum;
    private final int remain;

    Data(int code, int date, int maximum, int remain) {
        this.code = code;
        this.date = date;
        this.maximum = maximum;
        this.remain = remain;
    }

    int code()    { return code; }
    int date()    { return date; }
    int maximum() { return maximum; }
    int remain()  { return remain; }
}