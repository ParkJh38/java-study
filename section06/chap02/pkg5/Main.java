package section06.chap02.pkg5;

import section05.chap05.ex02.Button;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //  java.lang 패키지에 속한 기본 라이브러리 클래스들 -> import 하지 않고 바로 쓸 수 있다.
        System.out.println("이 클래스들은 왜 임포트를 안 해도 될까요?");
        Object object = new Object();
        String str = new String("java.lang 패키지 소속이라 그럼");
        Integer integer;
        Math math;

        //  다른 패키지에 속한 기본 라이브러리 클래스들 (모두 개별로 import 해주어야 사용 가능!)
        ArrayList arrayList;
        Calendar calendar;
        Optional optional;
        Iterator iterator;
        InputStream inputStream;
        Serializable serializable;
        Stream stream;
        Button button;
    }
}
