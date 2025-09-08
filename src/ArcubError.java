import java.util.Scanner;

public class ArcubError {
    ArcubError() {
        System.out.print("pls enter youre error code : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.printf("");
        if (x == 1) {
            System.out.println("H1: FAIL TO LOCK DOOR. 140 SIGNAL IS MISSED");
            System.out.println("خطای کنتاکت درب");
            System.out.println("------------------------------------------");
            System.out.println("پارامتر 7.9 را بررسی کنید.");
            System.out.println("کنتاکت درب، مدار ایمنی و تراول 140 را بررسی کنید.");
            System.out.println("پارامتر 11.3 را بررسی کنید.");
            System.out.println("عملکرد رله PR2 را بررسی نمایید.");
            System.out.println("مسیر فرمان فوتوسل را بررسی نمایید");
            System.out.println("سیم و ترمینال KA1 & KA2 را بررسی نمایید");
        }
        if (x == 2) {
            System.out.println("H2: FLOOR TO FLOOR MAX TRAVEL TIME ELAPSED");
            System.out.println("حداکثر زمان حرکت بین دو طبقه سپری شده است");
            System.out.println("------------------------------------------");
            System.out.println("پارامتر 2.8 را بررسی کنید.");
            System.out.println("سیگنال های ML1 & ML2 بررسی نمایید.");
            System.out.println("تراول مربوط ML1 & ML2 بررسی نمایید.");
            System.out.println("فاصله liftsense را بررسی نمایید.");
            System.out.println("آهنربای مربوط به liftsense را بررسی نمایید.");
            System.out.println("بررسی کنید کابین حرکت می کتد.");
        }
        if (x == 3) {
            System.out.println("H3: DOOR IS NOT CLOSED FOR A LONG TIME  ");
            System.out.println("درب برای مدت طولانی بسته نشده است");
            System.out.println("------------------------------------------");
            System.out.println("پارامتر 7.8 را بررسی کنید.");
            System.out.println("سیکنال 140 مدار ایمنی را بررسی نمایید.");
            System.out.println("تراول ها مربوط به 135 و 140 را بررسی نمایید.");
            System.out.println("کنتاکت درب کابین را بررسی کنید.");
            System.out.println("این خطا در صورت تنظیم صحیح به خطای H1 مربوط می شود");
        }
        if (x == 4) {
            System.out.println("H4: CAR CANT HOLD. PLEASE CHECK THE MOTOR PARAMETER");
            System.out.println("موتور نمی تواند کابین را نگه دارد");
            System.out.println("-----------------------------------------------------");
            System.out.println("پارامترهای موتور بررسی شود که با پلاک موتور همخوانی داشته باشد.");
            System.out.println("کوپل انکودر بررسی گردد.");
        }
        if (x == 5) {
            System.out.println("H5: BOTH LIMIT SWITCHES UP&DOWN ARE OPEN  ");
            System.out.println("دور انداز اجبار بالا و پایین (817 و 818) همزمان قطع شده اند");
            System.out.println("--------------------------------------------------------------");
            System.out.println("سنسور 817 و 818 را بررسی نمایید.");
            System.out.println("فاصله آهنربای قطع و وصل را بررسی نمایید.");
            System.out.println("تراول کابل مرتبط را بررسی نمایید.");
        }
        if (x == 6) {
            System.out.println("H6: TOP LIMIT SWITCH CUTS OFF WHIL RUNNING DOWN  ");
            System.out.println("سنسور دورانداز بالا (818) در حین حرکت کابین به سمت پایین قطع شده است");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("آهنربای قطع و وصل سنسور 818 را بررسی نمایید.");
            System.out.println("تراول کابل مرتبط را بررسی نمایید.");
        }
        if (x == 7) {
            System.out.println("H7: BOTTOM LIMIT SWITCH CUTS OFF WHILE RUNNING UP");
            System.out.println("سنسور دورانداز پایین (817) در حین حرکت کابین به بالا  قطع شده است");
            System.out.println("آهنربای قطع و وصل سنسور 817 را بررسی نمایید.");
            System.out.println("تراول کابل مرتبط را بررسی نمایید.");
        }
        if (x == 8) {
            System.out.println("H8: LOW DC BUS VOLTAGE");
            System.out.println("اDC BUS از حد معین کاهش یافته است");
            System.out.println("-------------------------------------------");
            System.out.println("ولتاژ اصلی L1,L2,L3 را بررسی نمایید.");
            System.out.println("ولتاژ فاز به فاز L1,L2,L3 را بررسی نمایید.");
            System.out.println("اهم مقاومت ترمز را بررسی نمایید.");
            System.out.println("اتصالات مقاومت ترمز را بررسی نمایید.");
            System.out.println("مقاومت ترمز را در جهت حرکت بالا بررسی نمایید.");
            System.out.println("مسیر ترمینال B , P را دنبال کنید.");
        }
        if (x == 9) {
            System.out.println("H9: HIGH DC BUS VOLTAGE");
            System.out.println("اDC BUS از حد معین افزایش یافته است");
            System.out.println("--------------------------------------------");
            System.out.println("ولتاژ اصلی L1,L2,L3 را بررسی نمایید.");
            System.out.println("ولتاژ فاز به فاز L1,L2,L3 را بررسی نمایید.");
            System.out.println("اهم مقاومت ترمز را بررسی نمایید.");
            System.out.println("اتصالات مقاومت ترمز را بررسی نمایید.");
            System.out.println("مقاومت ترمز را در جهت حرکت بالا بررسی نمایید.");
            System.out.println("مسیر ترمینال B , P را دنبال کنید.");
        }
        if (x == 10) {
            System.out.println("H10: KRC CHECK BACK ERROR");
            System.out.println("خطای KRC");
            System.out.println("--------------------------------------------------------------");
            System.out.println("در حالت بی حرکتی کابین سیگنال KRC را بررسی نمایید، روشن باشد");
            System.out.println("در حالت حرکت کابین سیگنال KRC را بررسی نمایید، خاموش باشد");
            System.out.println("بررسی نمایید ورودی ترمینال KRC برابر با 24V باشد");
            System.out.println("تیغه های NC کنتاکتورهای KFR1 & KFR2 را بررسی کنید.");
            System.out.println("سیم کشی مسیر مرتبط به KRC را بررسی نمایید.");
        }
        if (x == 11) {
            System.out.println("H11: ML1 & ML2 SIGNALS SHORT  CIRCUIT TO EACH OTHER.");
            System.out.println("خطای ML1&ML2 هنگامی که اتصال کوتاه می شوند");
            System.out.println("--------------------------------------------------------------");
            System.out.println("سیگنال ML1 & ML2 را بررسی نمایید");
            System.out.println("فاصله بین سنسورها و آهنربا را بررسی نمایید.");
            System.out.println("سیم بندی سنسور با کارکدک را بررسی نمایید.");
            System.out.println("سنسور و تراول کابل را بررسی نمایید.");
            System.out.println("سیم LS برای liftsense را از تراول کابل جدا نمایید.");
        }
        if (x == 12) {
            System.out.println("H12: DOOR BRIDGING RELAYS SR1 & SR3  DONT PICK UP ");
            System.out.println("رله های SR1 & SR3 مربوط به ADO جذب نمی شوند");
            //بررسی گردد؟؟؟
        }
        if (x == 13) {
            System.out.println("H13: DOOR BRIDGING RELAYS SR1 or SR3  DONT DROP  ");
            System.out.println("رله های SR1 یا SR3 مربوط به ADO بر نمی گردند");
            //بررسی گردد؟؟؟
        }
        if (x == 14) {
            System.out.println("H14: DOOR BRIDGING DISABLED BUT 140P SIGNAL IS STILL EXIST  ");
            System.out.println("اADO غیر فعال است اما سیگنال 140P همچنان وجود دارد");
            //بررسی گردد؟؟؟
        }
        if (x == 15) {
            System.out.println("H15: L1,  L2, L3 MAINS POWER SUPPLY FAILURE  ");
            System.out.println("ورودی L1-L2-L3 قطع شده است");
            System.out.println("--------------------------------------------------------");
            System.out.println("ولتاژ اصلی L1,L2,L3 را بررسی نمایید.");
            System.out.println("ولتاژ فاز به فاز L1,L2,L3 را بررسی نمایید.");
            System.out.println("در صورت صحیح بودن ولتاژها امکان خرابی دستگاه وجود دارد.");
        }
        if (x == 16) {
            System.out.println("H16: MOTOR CAN NOT SPIN IN  EVACUATION MODE");
            System.out.println("موتور در مد نجات اظطراری قادر به چرخیدن نیست");
            System.out.println("---------------------------------------------------");
            System.out.println("توان UPS و جریان باطری ها را بررسی نمایید.");
            System.out.println("فک ترمز را بررسی نمایید.");
            System.out.println("ولتاژ ترمز 840 و 2000 را بررسی نمایید.");
            System.out.println("ولتاژ ترمینال ها ترمز را بررسی نمایید.");
            System.out.println("بر اساس نوع سیم بندی پارامتر 8.2 را بررسی نمایید.");
        }
        if (x == 17) {
            System.out.println("H17: PTC SIGNAL OPEN. MOTOR OVER  HEATED");
            System.out.println("فعال شدن سیگنال PTC موتور، موتور بیش از حد داغ شده است");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("وجود ترموستات مقاومت ترمز در مسیر T3 , T4 یا پل بودن آن را بررسی نمایید");
            System.out.println("پارامتر 5.24 را بررسی نمایید.");
            System.out.println("اPTC موتور را بررسی نمایید.");
            System.out.println("دمای موتور را بررسی نمایید.");
            System.out.println("حرارت موتور بررسی نمایید که طبیعی باشد.");
            System.out.println("اT2,T را پل دهید، سیستم را نرمال رویزیون کنید اگر برطرف شد، PTC و سیم کشی آن به تابلو را بررسی نمایید.");
        }
        if (x == 18) {
            System.out.println("H18: DIPSWITCH CONFIGURATION  ERROR");
            System.out.println("خطای تنظیمات دیپ سوییچ");
            System.out.println("----------------------------------------------");
            System.out.println("جریان تابلو را بخوانید.");
            System.out.println("حالت دیپ سوییچ را بر اساس آمپر بررسی نمایید.");
            System.out.println("ورژن آپدیت را بررسی نمایید.");
            System.out.println("مشکل سخت افزاری می باشد.");

        }
        if (x == 19) {
            System.out.println("H19: SAME GROUP ID NAME USED ON  CONTROLLERS");
            System.out.println("اسامی مشابه در شناسه گروهی استفاده شده است");
            System.out.println("----------------------------------------------");
            System.out.println("پارامتر 2.21 را در دو تابلو بررسی نمایید.");
        }
        if (x == 21) {
            System.out.println("H21: DRIVE OVER CURRENT ERROR");
            System.out.println("خطای جریان بیش از حد درایو");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("بررسی نمایید توان درایو با توان موتور هم اندازه باشد.");
            System.out.println("سیم های U,V,W موتور بررسی نمایید.");
            System.out.println("در موتورهای گیربکس در حالت حلقه باز مشکل وجود داست 5.17 و 5.19 بررسی نمایید.");
            System.out.println("در صورت خطا فقط در حالت حلقه بسته در موتور گیربکس جهت انکودر را تغییر دهید.");
            System.out.println("اتصالات الکتریکی و مکانیکی انکودر را بررسی نمایید.");
        }
        if (x == 22) {
            System.out.println("H22: SERVICE TIME OVERFLOW");
            System.out.println("زمان سرویس و نگهداری رسیده است.");
            System.out.println("-----------------------------------------------");
            System.out.println("فعال بودن آیتم 2.39 را بررسی نمایید.");
            System.out.println("در صورت فعال بودن، آیتم 2.40 را افزایش دهید.");
            System.out.println("در نهایت لیست خطاها را پاک نمایید.");
        }
        if (x == 23) {

        }
        if (x == 24) {

        }
        if (x == 25) {

        }
        if (x == 26) {

        }
        if (x == 27) {

        }
        if (x == 28) {

        }
        if (x == 29) {

        }
        if (x == 30) {

        }
        if (x == 31) {

        }
        if (x == 32) {

        }
        if (x == 33) {

        }
        if (x == 34) {

        }
        if (x == 35) {

        }
        if (x == 36) {

        }
        if (x == 37) {

        }
        if (x == 38) {

        }
        if (x == 39) {

        }
        if (x == 40) {

        }
        if (x == 41) {

        }
        if (x == 42) {

        }
        if (x == 43) {

        }
        if (x == 44) {

        }
        if (x == 45) {

        }
        if (x == 46) {

        }
        if (x == 47) {

        }
        if (x == 48) {

        }
        if (x == 49) {

        }
        if (x == 50) {

        }
        if (x == 51) {

        }
        if (x == 52) {

        }
        if (x == 53) {

        }
        if (x == 54) {

        }
        if (x == 55) {

        }
        if (x == 56) {

        }
        if (x == 57) {

        }
        if (x == 58) {

        }
        if (x == 59) {

        }
        if (x == 60) {

        }
        if (x == 62) {

        }
    }
}
