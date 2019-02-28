package Day7;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CustomCalendar {

    public final String inputPattern = "MMMM dd, yyyy";
    public final String outputPattern = "EEEE MMMM dd, yyyy";//ctrl + d dupa ce ai selectat o metoda o duplica, sa nu o mai pui cu copy paste

    public static void main(String[] args) throws IOException, URISyntaxException, ParseException {

        CustomCalendar customCalendar = new CustomCalendar();

        List<String> lines = customCalendar.getLinesFromFile("Calendar.txt");//intre ghilimele e numele fisierului pe care vrem sa il aducem
        Map<Calendar, List<String>> map = customCalendar.transformToCalendar(lines);
        //cream o metoda pentru a printa calendarul ca sa nu mai folosim sout
        //metoda trebuie apelata pe obiect

        customCalendar.printCalendarFutureEvents(map);//publica  evenimentele din calendar de dupa ziua de azi


        customCalendar.printCalendar(map);//pulica toate evenimentele din calendar
    }

    private void printCalendar(Map<Calendar, List<String>> map) {
        //iteram cupa key
        for (Calendar c : map.keySet()) {
            DateFormat df = new SimpleDateFormat(outputPattern);
            System.out.println(df.format(c.getTime()) + "-" + map.get(c));
            //get aduce valoarea key

        }
    }

    //publicam calendarul doar dupa ziua de azi
    private void printCalendarFutureEvents(Map<Calendar, List<String>> map) {
        //iteram cupa key
        for (Calendar c : map.keySet()) {
            if (c.after(Calendar.getInstance())) {


                System.out.println(c.get(Calendar.MONTH));


                DateFormat df = new SimpleDateFormat(outputPattern);
                System.out.println(df.format(c.getTime()) + "-" + map.get(c));
            }
            //get aduce valoarea key

        }
    }

    //am creat o metoda care intoarce acest map
    private Map<Calendar, List<String>> transformToCalendar(List<String> lines) throws ParseException {

        Map<Calendar, List<String>> map = new TreeMap<>();//transform custom calendar in TreeMap

        for (String line : lines) {
            String[] splitLine = line.split("-");//regex e elementul inainte de care se face split

            DateFormat df = new SimpleDateFormat(inputPattern);//formateaza data din February 1,  July 2019 inin 07 01, 2019"
            //am ;luat de la inceput data
            Date date = df.parse(splitLine[0]);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);//face conversia dintre data din fisier o parseaza

            if (!map.containsKey(calendar)) { //!inainte inseamna nu adica nu contine calendsarul
                List<String> list = new ArrayList<>();
                list.add(splitLine[1]);
                map.put(calendar, list);
            } else {
                map.get(calendar).add(splitLine[1]);//adauga urmatoarea linie
            }

        }
        return map;
    }


    public List<String> getLinesFromFile(String pathToFile) throws URISyntaxException, IOException {
        //aduce fisierul Calendar din resources
        //am facut o metoda care cheama liniile din fisier
        URL url = this.getClass().getClassLoader().getResource(pathToFile);

        Path path = Paths.get(url.toURI());
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        //intoarce ca string fiecare linie din fisierul nostru
        return lines;
        //sparg fisierul in data si evenimentul de dupa data
        //iei linie cu linie si spargi dupa - partea stanga o faci data dreapta ramane string

    }


}
