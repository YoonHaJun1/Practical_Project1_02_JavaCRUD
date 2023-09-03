package parking;

import java.util.ArrayList;
import java.util.Scanner;
public class ParkCRUD implements ICRUD{
    ArrayList<Number> list;
    Scanner s;
    ParkCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }

    /*
    * 차량 번호 입력 : 4967
    * 새 차량이 주차장에 주차했습니다.
    *
    */
    @Override
    public Object add() {
        System.out.print("=> 차량 번호 입력 : "); //4967
        int number = s.nextInt();

        return new Park(number);
    }

    public void addCar() {
        Park one = (Park)add();
        list.add(one.getNumber());
        System.out.println("새 차량이 주차장에 주차하였습니다.");
    }
    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int number) {

    }

    /*
    => 원하는 메뉴는? 1
    ----------------------
    1     4793
    2     2352

    */
    public void listAll() {
        System.out.println("----------------------");
        for(int i = 0; i < list.size(); i++) {
            System.out.print((i+1) + "   ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("----------------------");
    }
}
