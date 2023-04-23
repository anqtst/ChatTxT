package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myapplication.R;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MainActivity extends Activity
{
protected void onCreate(Bundle savedInstanceState)
 {super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);}
 String nw="";
 public void btn(View view)
 {String msg0;msg0=btn0();}

 public String btn0()
 {
String txt0=" ",msg="AI chatTxT",mn="&euro",txt3="";
int nnn=10;

//char[] latinAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

//char[] latinAlphabetUpperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

//char[] fullCyrillicAlphabet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

//char[] reducedCyrillicAlphabet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э'};

//char[] ruA = new char[32];
//for (int i = 0; i < 32; i++) {
//    if (i < 16) {
//        ruA[i] = (char)('а' + i);
//    } else {
//        ruA[i] = (char)('А' + i - 16);
//    }
//}

//String[] sruA=new String[32];
//for (int i=0;i<32;i++)
//{sruA[i]=(String)("a"+ i);}


 TextView tv=findViewById(R.id.tx);
 TextView tt2=findViewById(R.id.tt);
 
 LocalDateTime t0=LocalDateTime.now();
 LocalDate d0=LocalDate.now();
 
 EditText nw3=findViewById(R.id.ti3);
 EditText ttt3=findViewById(R.id.ttt);
 EditText rrr3=findViewById(R.id.rrr);
 
 String tt33=ttt3.getText().toString();
 String rr33=rrr3.getText().toString();
//if(rr33=="ru")ru=100;

 nnn=new Integer(tt33).intValue();
 
 String new3=nw3.getText().toString();
// nw=new3;
 String d00=d0.toString();

txt3="AIchaTxT: <p>";
String wrd="",b0="";
//b0=" ";wrld=". ";
int q=0,qq=0;
double lnr=Math.random()*10,wnr=2,nr00=1;

int nr0=1;

for (int nn=0;nn<nnn;nn++)
{

lnr=(float)(int)Math.round(lnr);
if(lnr<1){lnr=2;}
//double wnr=Math.random()*10;

for(q=0;q<lnr;q++)
{
wnr=Math.random()*10;if(wnr<1){wnr=1;}
wnr=(float)(int)Math.round(wnr);

//if(q==0)nr0=nr0+23;

for(qq=0;qq<wnr;qq++)
{


nr00=Math.random()*30;
if(nr0<1){nr0=30;}

nr0=(int)Math.round(nr00);

if(q==0&qq==0)nr0=nr0+33;
if(rr33.equals("cyr")|rr33.equals(""))nr0=nr0+100;
//nr0=nr0+100;
//const latinAlphabet = 'abcdefghijklmnopqrstuvwxyz';
//const letterIndex = nr0 - 1; // преобразуем номер в индекс (от 0 до 25)
//if (letterIndex >= 0 && letterIndex < latinAlphabet.length) {
//  b0 = latinAlphabet[letterIndex];
//}

//char[] latinAlphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
//nr0 = 1;
//b0 = latinAlphabet[nr0 - 1]; // будет "a"



if(nr0==1)b0="a";
//int nr11=11;

//if(nr0==1)b0 = sruA[nr0 - 1];

if(nr0==2)b0="b";
if(nr0==3)b0="c";
if(nr0==4)b0="d";
if(nr0==5)b0="e";
if(nr0==6)b0="f";
if(nr0==7)b0="g";
if(nr0==8)b0="h";
if(nr0==9)b0="i";
if(nr0==10)b0="j";
if(nr0==11)b0="k";
if(nr0==12)b0="l";
if(nr0==13)b0="m";
if(nr0==14)b0="n";
if(nr0==15)b0="o";
if(nr0==16)b0="p";
if(nr0==17)b0="r";
if(nr0==18)b0="s";
if(nr0==19)b0="t";
if(nr0==20)b0="u";
if(nr0==21)b0="w";
if(nr0==22)b0="y";
if(nr0==23)b0="x";

if(nr0==24)b0="a";
if(nr0==25)b0="e";
if(nr0==26)b0="i";
if(nr0==27)b0="o";
if(nr0==28)b0="u";




if(nr0==34)b0="A";
if(nr0==35)b0="B";
if(nr0==36)b0="C";
if(nr0==37)b0="D";
if(nr0==38)b0="E";
if(nr0==39)b0="F";
if(nr0==40)b0="G";
if(nr0==41)b0="H";
if(nr0==42)b0="I";
if(nr0==43)b0="J";
if(nr0==44)b0="K";
if(nr0==45)b0="L";
if(nr0==46)b0="M";
if(nr0==47)b0="N";
if(nr0==48)b0="O";
if(nr0==49)b0="P";
if(nr0==50)b0="R";
if(nr0==51)b0="S";
if(nr0==52)b0="T";
if(nr0==53)b0="U";
if(nr0==54)b0="W";
if(nr0==55)b0="Y";
if(nr0==56)b0="X";

if(nr0==57)b0="A";
if(nr0==58)b0="E";
if(nr0==59)b0="I";
if(nr0==60)b0="O";
if(nr0==61)b0="U";

//b0 = sruA[nr0-1];

if(nr0==101)b0="а";
if(nr0==102)b0="б";
if(nr0==103)b0="в";
if(nr0==104)b0="г";
if(nr0==105)b0="д";
if(nr0==106)b0="е";
if(nr0==107)b0="ж";
if(nr0==108)b0="з";
if(nr0==109)b0="и";
if(nr0==110)b0="к";
if(nr0==111)b0="л";
if(nr0==112)b0="м";
if(nr0==113)b0="н";
if(nr0==114)b0="о";
if(nr0==115)b0="п";
if(nr0==116)b0="р";
if(nr0==117)b0="с";
if(nr0==118)b0="т";
if(nr0==119)b0="у";
if(nr0==120)b0="ф";
if(nr0==121)b0="х";
if(nr0==122)b0="ц";
if(nr0==123)b0="ч";
if(nr0==124)b0="ш";
if(nr0==125)b0="щ";
if(nr0==126)b0="э";
if(nr0==127)b0="ю";
if(nr0==128)b0="я";

if(nr0==134)b0="А";
if(nr0==135)b0="Б";
if(nr0==136)b0="В";
if(nr0==137)b0="Г";
if(nr0==138)b0="Д";
if(nr0==139)b0="Е";
if(nr0==140)b0="Ж";
if(nr0==141)b0="З";
if(nr0==142)b0="И";
if(nr0==143)b0="К";
if(nr0==144)b0="Л";
if(nr0==145)b0="М";
if(nr0==146)b0="Н";
if(nr0==147)b0="О";
if(nr0==148)b0="П";
if(nr0==149)b0="Р";
if(nr0==150)b0="С";
if(nr0==151)b0="Т";
if(nr0==152)b0="У";
if(nr0==153)b0="Ф";
if(nr0==154)b0="Х";
if(nr0==155)b0="Ц";
if(nr0==156)b0="Ч";
if(nr0==157)b0="Ш";
if(nr0==158)b0="Щ";
if(nr0==159)b0="Э";
if(nr0==160)b0="Ю";
if(nr0==161)b0="Я";


if(nr0==30)b0=" "+new3+" ";
nw=new3;
//if(!new3.equals("Andqpb"))nw=new3;
if(nr0==29)b0=" "+nw+", ";

wrd=wrd+b0;

//tv.setText(wrd);

};

//wrld=wrld+" ("+wnr+") ";

txt3=txt3+" "+wrd;
wrd="";
};

//wrd=wrd+". ";
txt3=txt3+". ";

};

LocalDateTime t1=LocalDateTime.now();  
long p2=ChronoUnit.MILLIS.between(t0,t1);
txt0=
//String.valueOf(txt0+" <b>Time: "+p2+" </b>ms <i>T2:</> <b>"+t1+"</b> <u>T0</u>: "+"<font color=\"lime\">"+d00+"</font>\n")
txt0+"<p>"
+msg
;

tt2.setTextSize(15f);

//tt2.setCursorVisible(true);tt2.setFocusableInTouchMode(true);tt2.requestFocus();tt2.setEnabled(true);
tt2.setTextIsSelectable(true);

tt2.setText(Html.fromHtml(txt3+"</b><font color=\"blue\">"+txt0+" "+"<b>Level="+lnr+" </b><font color=\"blue\">"+rr33+" <b>Time: "+p2+" </b>ms <i><p>T2: </><b>"+t1+" </b><u>T0</u>: "+"<font color=\"lime\">"+d00));

 return txt0;
 }
}
