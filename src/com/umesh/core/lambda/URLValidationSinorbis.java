package com.umesh.core.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by umesh_w on 9/18/2017.
 */
public class URLValidationSinorbis {


    public static void main(String args[]){

       System.out.print(new URLValidationSinorbis().isUrlAvailable());

    }


    /**
     *
     * @return
     */
    public boolean isUrlAvailable() {


        String url = "ddd/eee/fff";

        String[] strArr = url.split("/");
        List<String> listOfWords = new ArrayList<>();

        String init = "";
        for (int i = 0; i < strArr.length; i++) {

            String s = strArr[i];
            listOfWords.add(init + s);
            init = init + s + "/";
        }

        int length = listOfWords.size();

        List<String> websiteList = new URLValidationSinorbis().getList();

        for (int j=0; j< length; j++) {
            String word = listOfWords.get(j);
            System.out.println(word);

            for (String ss : websiteList) {
                if(j < length-1){
                    if (ss.equalsIgnoreCase(word) ) {
                        return false;
                    }
                }else{
                    if (ss.equalsIgnoreCase(word) || ss.startsWith(word + "/")) {
                        return false;
                    }
                }

            }
        }

        return true;
    }



    public List<String> getList(){

        List<String> websiteList = new ArrayList<>();

        websiteList.add("abc/wer");
        websiteList.add("xyz");
        websiteList.add("lmn/pqr");
        websiteList.add("pqr/bb");
        websiteList.add("ddd/eee");
        websiteList.add("fff");
        websiteList.add("ccc");

        return websiteList;
    }


}
