import entities.Member;
import service.MemberService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        ArrayList<Member> arr = new ArrayList<>();
        do {
            MemberService memberService = new MemberService();
            Member member = memberService.memberInput(sc);
            arr.add(member);
            System.out.println("ban co muon nhap them thanh vien khong? (Y/N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                continue;
            }
            else {
                System.out.println(arr);
                System.exit(0);
            }
        }while (true);
    }
}
