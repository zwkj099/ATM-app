package test;

import test.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {
        //1、准备系统需要的容器对象，用户存储账户
        ArrayList<Account> accounts = new ArrayList<>();
        //2、 装备系统的首页：登录、开户
        showMain(accounts);

    }

    public static void showMain(ArrayList<Account> accounts) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入 你想要的操作 1、登录，2、开户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登录
                    break;
                case 2:
                    //开户
                    break;
                default:
                    System.out.println("输入的命令不被支持");
            }
        }
    }
}
