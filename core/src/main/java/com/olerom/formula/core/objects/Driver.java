package com.olerom.formula.core.objects;

/**
 * Date: 08.03.17
 * Driver object
 *
 * @author olerom
 */
public class Driver {

    private String driverId;
    private int permanentNumber;
    private String code;
    private String url;
    private String givenName;
    private String familyName;
    private String dateOfBirth;
    private String nationality;


    public Driver(String driverId, String permanentNumber, String code, String url,
                  String givenName, String familyName, String dateOfBirth, String nationality) {
        this.driverId = driverId;
        this.permanentNumber = Integer.valueOf(permanentNumber);
        this.code = code;
        this.url = url;
        this.givenName = givenName;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", permanentNumber=" + permanentNumber +
                ", code='" + code + '\'' +
                ", url='" + url + '\'' +
                ", givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}