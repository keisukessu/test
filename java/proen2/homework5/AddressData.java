package proen2.homework5;

public class AddressData {
    public String name;
    public String kana;
    public String phone;
    public String mail;

    public AddressData(String name, String kana, String phone, String mail) {
        this.name = name;
        this.kana = kana;
        this.phone = phone;
        this.mail = mail;
    }

    public void print() {
        System.out.println("Name:" + name);
        System.out.println("Kana:" + kana);
        System.out.println("Phone:" + phone);
        System.out.println("Mail:" + mail);
    }
}
