package service;

import entities.Member;

import java.util.Scanner;

public class MemberService {
    public Member memberInput (Scanner sc) {
        System.out.print("nhap ten thanh vien: ");
        String name = sc.nextLine();
        System.out.printf("nhap ngay sinh: ");
        String dob = sc.nextLine();
        System.out.printf("nhap nghe nghiep: ");
        String job = sc.nextLine();

        return new Member(name, dob, job);

    }
}
