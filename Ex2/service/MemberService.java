package Ex2.service;

import Ex2.entities.Family;
import Ex2.entities.Member;

import java.util.Scanner;

public class MemberService {
    public Member member (Scanner sc) {

        System.out.printf("nhap ten ho gia dinh: ");
        int address = Integer.parseInt(sc.nextLine());
        System.out.printf("nhap ten thanh vien: ");
        String name = sc.nextLine();
        System.out.printf("nhap ngay thang nam sinh: ");
        String dob = sc.nextLine();
        System.out.printf("nghe nghiep: ");
        String job = sc.nextLine();

        return member(AutoId, address, name, dob, job);
    }
}
