package org.ckrishnan;

import org.apache.commons.exec.util.StringUtils;

public class StringDemo {

    public static void main(String[] args) {

        String pagination = "<<1-2 of 2>>";
        System.out.println(pagination.length());
        int pageCount = 0;

        pagination = pagination.replace("<<", "");
        pagination = pagination.replace(">>","");
        System.out.println(pagination.length());

        if (pagination.length() == 10) {



             pageCount = Integer.parseInt(pagination.substring(pagination.length() - 3));
             System.out.println(pageCount);

        } else if (pagination.length() == 9) {


             pageCount = Integer.parseInt(pagination.substring(pagination.length() - 2));
             System.out.println(pageCount);

        } else if (pagination.length() == 8) {


             pageCount = Integer.parseInt(pagination.substring(pagination.length() - 1));
            System.out.println(pageCount);

        }

        System.out.println(pageCount);


    }

}
