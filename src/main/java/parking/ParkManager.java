package parking;

import java.util.Scanner;

public class ParkManager {
        Scanner s = new Scanner(System.in);
        ParkCRUD parkCRUD;
        /*
             주차 관리 시스템
        ======================
        1.주차 현황 보기
        2.층별 주차 현황 보기
        3.차량 검색
        4.차량 추가
        5.차량 삭제
        6.파일 저장
        0.나가기
        ======================
        => 원하는 메뉴는? 3
        */

        ParkManager() {
            parkCRUD = new ParkCRUD(s);
        }
        public int selectMenu() {
            System.out.print("     주차 관리 시스템     \n"
                + "======================\n"
                + "1.주차 현황 보기\n"
                + "2.층별 주차 현황 보기\n"
                + "3.차량 검색\n"
                + "4.차량 추가\n"
                + "5.차량 삭제\n"
                + "6.파일 저장\n"
                + "0.나가기\n"
                + "======================\n"
                + "=> 원하는 메뉴는?");

        return s.nextInt();
        }
    public void start() {
            while(true) {
                int menu = selectMenu();
                if(menu == 0) break;
                if(menu == 4) {
                    parkCRUD.addCar();
                }
                else if(menu == 1) {
                    parkCRUD.listAll();
                }
            }
    }
}
