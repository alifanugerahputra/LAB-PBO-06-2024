package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu;
        try {
            selectMenu = sc.nextInt(); 
            sc.nextLine();
            switch (selectMenu) {
                case 1:
                // Membuka Halaman Login
                    showLoginMenu();
                    break;
                case 2:
                // Membuka Halaman Register
                    showRegisterMenu();
                    break;    
            }
            sc.nextLine();
        } catch (Exception e){
            System.out.println("Error!");
            runApp(); // Latihan Nomor 1, Try Catchnya 
        }
    }

    private static void showLoginMenu() {
        boolean isPasswordMatch;
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).username.equals(username)){
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();

            if (listUser.get(userIndex).password.equals(password)){
                isPasswordMatch = true;
            } else {
                isPasswordMatch = false;
            }
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Gagal Login!");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        for (User x : listUser){ // Latihan no.3
            if (x.username.equals(username)){
                System.out.println("Username Telah Ada! Tolong coba lagi");
                showRegisterMenu();
            }
        }
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        // IF Pertama itu latihan no.2
        if ((password.length() < 3) || (username.length() < 3)){ // Mengapa kurang dari 3? karena kalau dienter maka "\n" yang terinput ke dalamnya
            System.out.println("Password atau Username tidak boleh kosong!");
            System.out.println("Registrasi Ulang!");
            showRegisterMenu();
        }
        //IF kedua ini latihan no.4
        if (password.length() < 8){
            System.out.println("Password anda kurang dari 8 karakter! Coba lagi!");
            showRegisterMenu();
        }
        User user = new User(username, password);
        Profile profile = new Profile();

        // Menginput Data Profile
        inputDataProfile(profile);

        String nickname = StringUtils.nickName(profile.getFullname());
        profile.setNickname(nickname);
        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------\nSELAMAT DATANG !!\n-------------------------");
        System.out.println("Nama Lengkap   : "+ profile.getFullname());
        System.out.println("Nama Panggilan : "+ profile.getNickname());
        System.out.println("Umur           : "+ profile.getAge());
        System.out.println("Hobby          : "+ profile.getHobby());
        System.out.println("-------------------------");
    
    }

    private static void inputDataProfile(Profile profile){
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        
        profile.setFullname(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
    }
}