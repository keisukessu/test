package proen2.homework5;

public class TestEx0505_8 {
    public static void main(String args[]) {
        Address address = new Address();
        AddressData data = null;
        // 連結リストへデータを追加
        data = new AddressData("名前１", "なまえ１", "0001", "name1");
        address.insertFirst(data);
        data = new AddressData("名前２", "なまえ２", "0002", "name2");
        address.insertFirst(data);
        data = new AddressData("名前３", "なまえ３", "0003", "name3");
        address.insertFirst(data);
        address.displayList(); // 連結リストの表示
        System.out.println("-------");
        data = address.deleteFirst(); // リスト先頭からデータを削除
        address.displayList(); // 連結リストの表示
        System.out.println("-------");
        data.print(); // AddressDataクラスのprintメソッドの確認と
        // deleteFirstメソッドの返り値の確認

        System.out.println("-- 5-6 --");
        data = address.getAddressData(2);
        data.print();

        Boolean result;
        AddressData newdata = null;
        System.out.println("-- 5-7 --");
        newdata = new AddressData("名前５", "なまえ５", "0010", "name5");
        result = address.insert(newdata, 2);
        if (result == true)
            System.out.println("insert 成功");
        else
            System.out.println("insert 失敗");
        address.displayList(); // 連結リストの表示

        // ここまで必須課題5-7の動作確認プログラム
        System.out.println("-- 5-8 --");
        data = address.delete(3);
        address.displayList(); // 削除後リストの表示
        if (data == null)
            System.out.println("delete 失敗");
        else {
            System.out.println("delete 成功");
            data.print();
        }

    }
}