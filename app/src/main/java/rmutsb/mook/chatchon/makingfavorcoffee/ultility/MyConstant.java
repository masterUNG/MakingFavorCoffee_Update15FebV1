package rmutsb.mook.chatchon.makingfavorcoffee.ultility;

/**
 * Created by Nut on 30/10/2560.
 */

public class MyConstant {

    private String urlPostUserString = "http://androidthai.in.th/nut/addUserNut.php";
    private String urlGetUserString = "http://androidthai.in.th/nut/getAllDataNut.php";
    private String urlAddShowOrderString = "http://androidthai.in.th/nut/addShowOder.php";
    private String urlGetAllShowOrderString = "http://androidthai.in.th/nut/getAllShowOder.php";
    private String urlGetOrderWhereIdLoginAnDateTime = "http://androidthai.in.th/nut/getOrderWhereIdLoginAnDateTime.php";
    private String urlGetPriceWhereNameCoffee = "http://androidthai.in.th/nut/getPriceWhereCoffee.php";



    private String[] columUserStrings = new String[]{"user_id", "user_Name", "user_Surname", "user_Phone", "user_Email", "user_Password"};
    private String[] columnShowOrderStrings = new String[]{"id", "idLogin", "NameCoffee", "TypeCoffee", "Espresso", "CocoPowder", "Milk", "FrappePowder", "Item", "DateTimeOder"};


    public String getUrlGetPriceWhereNameCoffee() {
        return urlGetPriceWhereNameCoffee;
    }

    public String getUrlGetAllShowOrderString() {
        return urlGetAllShowOrderString;
    }

    public String getUrlGetOrderWhereIdLoginAnDateTime() {
        return urlGetOrderWhereIdLoginAnDateTime;
    }

    public String[] getColumnShowOrderStrings() {
        return columnShowOrderStrings;
    }

    public String getUrlAddShowOrderString() {
        return urlAddShowOrderString;
    }

    public String[] getColumUserStrings() {
        return columUserStrings;
    }

    public String getUrlGetUserString() {
        return urlGetUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }
}
