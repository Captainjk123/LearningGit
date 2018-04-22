package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearningStream {

    public static String getValueMapper(Coder coder){
        return coder.getId() + coder.getName();
    }
    public static void main(String[] args) {

        List<Coder> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(new Coder(i, 20+i, "coder" + i, "play" + i));
        }

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(Coder::getId, LearningStream::getValueMapper));
        System.out.println(map.get(1));
        System.out.println(map);
    }

}
