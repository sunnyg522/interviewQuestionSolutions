package comcast;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
/**
 * @project q
 * @authore dgunda on 2/19/19
 */
public class TestNearestCoordinates {

        public static class XYCoordinateAndDist implements Comparable<XYCoordinateAndDist> {
            private int distance;
            private String key;
            private List<String> list = new ArrayList<String>();

            public XYCoordinateAndDist(int distance, String key, List<String> list) {
                this.setDistance(distance);
                this.key = key;
                this.list = list;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public List<String> getList() {
                return list;
            }

            public void setList(String x, String y) {
                list.add(x);
                list.add(y);
            }

            public void setKey(String key){
                this.key = key;
            }

            public String getKey(){
                return key;
            }

            @Override
            public int compareTo(XYCoordinateAndDist arg0) {
                return this.getDistance() - arg0.getDistance();
            }
        }

        public static List<List<String>> sortList(List<Coordinates> list, Coordinates origin) {
            List<List<String>> result = new ArrayList<List<String>>();
            if(list.isEmpty())	return result;
            PriorityQueue<XYCoordinateAndDist> que = new PriorityQueue<XYCoordinateAndDist>();
            //Coordinates origin = list.get(0);
            String[] originarr = origin.getValue().split(",");
            for(int i=0;i<list.size();i++) {
                Coordinates coordinate  = list.get(i);
                String[] corArr = coordinate.getValue().split(",");
                int x = Integer.parseInt(corArr[0]) - Integer.parseInt(originarr[0]);
                int y = Integer.parseInt(corArr[1]) - Integer.parseInt(originarr[1]);
                int dist = (int) Math.sqrt((x * x) + (y * y));
                List<String> strArr = Arrays.asList(corArr);
                que.add(new XYCoordinateAndDist(dist, coordinate.getId(), strArr));
            }
            while(!que.isEmpty()) {
                XYCoordinateAndDist xy = que.poll();
                result.add(xy.getList());
            }
            return result;
        }

        public static List<Coordinates> getListOfCoordinates(){
            String json ="[\n" +
                    "  {\"id\":\"a\",\"value\":\"44,67\"},\n" +
                    "  {\"id\":\"b\",\"value\":\"31,49\"},\n" +
                    "  {\"id\":\"c\",\"value\":\"93,6\"},\n" +
                    "  {\"id\":\"d\",\"value\":\"20,16\"},\n" +
                    "  {\"id\":\"e\",\"value\":\"68,53\"},\n" +
                    "  {\"id\":\"f\",\"value\":\"71,8\"},\n" +
                    "  {\"id\":\"g\",\"value\":\"61,90\"},\n" +
                    "  {\"id\":\"h\",\"value\":\"34,97\"},\n" +
                    "  {\"id\":\"i\",\"value\":\"21,63\"},\n" +
                    "  {\"id\":\"j\",\"value\":\"7,21\"},\n" +
                    "  {\"id\":\"k\",\"value\":\"0,81\"},\n" +
                    "  {\"id\":\"l\",\"value\":\"75,92\"},\n" +
                    "  {\"id\":\"m\",\"value\":\"43,64\"},\n" +
                    "  {\"id\":\"n\",\"value\":\"18,64\"},\n" +
                    "  {\"id\":\"o\",\"value\":\"10,61\"},\n" +
                    "  {\"id\":\"p\",\"value\":\"37,27\"},\n" +
                    "  {\"id\":\"q\",\"value\":\"44,88\"},\n" +
                    "  {\"id\":\"r\",\"value\":\"75,63\"},\n" +
                    "  {\"id\":\"s\",\"value\":\"99,46\"},\n" +
                    "  {\"id\":\"t\",\"value\":\"28,51\"},\n" +
                    "  {\"id\":\"u\",\"value\":\"19,84\"},\n" +
                    "  {\"id\":\"v\",\"value\":\"8,66\"},\n" +
                    "  {\"id\":\"w\",\"value\":\"88,79\"},\n" +
                    "  {\"id\":\"x\",\"value\":\"6,76\"},\n" +
                    "  {\"id\":\"y\",\"value\":\"84,100\"},\n" +
                    "  {\"id\":\"z\",\"value\":\"32,33\"}\n" +
                    "]";
            List<Coordinates> coordinates = null;
            ObjectMapper mapper = new ObjectMapper();
            try {
                coordinates = Arrays.asList(mapper.readValue(json, Coordinates[].class));
                System.out.println(coordinates.get(0).getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return coordinates;
        }

        public static void main(String[] args) {
            //System.out.println(getListOfCoordinates().get(0).getValue());
            Coordinates coordinates = new Coordinates();
            coordinates.setId("origin");
            coordinates.setValue("44,67");
            System.out.println(sortList(getListOfCoordinates(),coordinates));
        }

    }
