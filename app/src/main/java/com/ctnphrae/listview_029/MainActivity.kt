package com.ctnphrae.listview_029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val addArray = arrayOf("Alfa Romeo","Audi","Aston Martin","Ariel"
        ,"Artega","Arrinera","Bentley","BMW","Buick","Brabus","Bugatti","Chevrolet","Cadillac"
        ,"koenigsegg","Ferrari","Ford","Fiat","Apollo","Ginetta","Honda")
    val detailArr = arrayOf("อัลฟาโรเมโอ ในนามบริษัท Alfa Romeo Automobiles S.p.A. บางครั้งก็นิยมเรียกชื่อสั้นๆเข้าใจง่ายว่า อัลฟา" +
            " เป็นผู้ผลิตรถยนต์สัญชาติอิตาลี แห่งเมืองมิลาน ก่อตั้งในปี ค.ศ. 1910 สร้างชื่อเสียงมาจากการผลิตรถสปอร์ตราคาแพง และการแข่งขันกีฬามอเตอร์สปอร์ต" +
            " ปัจจุบันอยู่ภายใต้การครอบครองของ FCA Italy S.p.A.","อาวดี้ เป็นบริษัทผลิตรถยนต์ของเยอรมนี มีสำนักงานอยู่ที่เมืองอิงก็อลชตัทในรัฐบาวาเรีย " +
            "ก่อตั้งในปีค.ศ. 1899 จัดว่าเป็นรถที่มีคุณภาพทัดเทียมกับเมอร์ซีเดส-เบนซ์ และบีเอ็มดับเบิลยู ปัจจุบันอยู่ในเครือฟ็อลคส์วาเกิน บริษัทผู้ผลิตรถยนต์รายใหญ่ในเยอรมนี" +
            " ซึ่งอาวดี้ก็มีบริษัทในเครือคือลัมโบร์กีนี รถยนต์สปอร์ตจากประเทศอิตาลี","แอสตันมาร์ติน เป็นชื่อบริษัทผลิตรถยนต์สปอร์ตหรูของสหราชอาณาจักร มีฐานการผลิตที่เมืองเกย์ดอน " +
            "ในอังกฤษ ชื่อยี่ห้อแอสตันมาร์ตินนี้ ตั้งชื่อตามนามสกุลของลีโอเนล มาร์ติน ผู้ก่อตั้งบริษัท และตามชื่อสถานที่ เนินแอสตัน ใกล้กับหมู่บ้านแอสตันคลินตัน ในเมืองบักกิงแฮมเชอร์ " +
            "ตั้งแต่ พ.ศ. 2537 จนถึง พ.ศ. 2550","แปลจากภาษาอังกฤษ-เอเรียลมอเตอร์คอร์ปอเรชั่น จำกัด เป็น บริษัท ผู้ผลิตยานยนต์ที่มีผลการดำเนินงานอยู่ใน" +
            " Crewkerne ในซัมเมอร์เซ็ทประเทศอังกฤษ","แปลจากภาษาอังกฤษ-Artega Automobil GmbH & Co. KG เป็น บริษัท " +
            "ผู้ผลิตรถสปอร์ตเยอรมันที่ตั้งอยู่ในDelbrückประเทศเยอรมนี ก่อตั้งขึ้นโดย Klaus Dieter Frers ในปี 2006 ผลิตภัณฑ์แรกของ บริษัท" +
            " คือcoupéกีฬากลางที่เปิดตัวในปี 2007 ในช่วงต้นปี 2010 บริษัท เอกชนและ บริษัท ร่วมทุนที่ถือหุ้นอยู่แล้วใน Artega ได้ควบคุมอย่างสมบูรณ์"
        ,"บริษัท ก่อตั้งขึ้นในปี 2551 โดยพี่น้องŁukaszและ Marek Tomkiewicz ในปี 2554 " +
                "ได้ประกาศเปิดตัวซุปเปอร์คาร์รุ่นแรกที่พิสูจน์แล้วโดยใช้เครื่องยนต์ขนาดกลางและด้านหลังแบบไดรฟ์ ต้นแบบที่สองของพวกเขาถูกนำเสนอในปี 2012 " +
                "โดยเริ่มแรกชื่อว่า Venocara [1] ต่อมาเปลี่ยนชื่อเป็น Hussarya"
        ,"แปลจากภาษาอังกฤษ-Bentley Motors Limited เป็นผู้ผลิตและจำหน่ายรถยนต์หรูและ SUVs ของอังกฤษและเป็น " +
                "บริษัท ย่อยของกลุ่มโฟล์คสวาเก้นตั้งแต่ปี 1998 สำนักงานใหญ่ตั้งอยู่ที่ Crewe ประเทศอังกฤษ บริษัท ก่อตั้งขึ้นในชื่อ Bentley Motors Limited "
        ,"บีเอ็มดับเบิลยู หรือในภาษาเยอรมันว่า เบเอ็มเว (เยอรมัน: BMW) หรือชื่อเต็มคือ ยนตรกิจบาวาเรีย (เยอรมัน: Bayerische Motoren Werke) เป็นบริษัทผลิตยานยนต์ของประเทศเยอรมนี บริษัทก่อตั้งในปีค.ศ. 1916 เมื่อแรกก่อตั้งเป็นบริษัทผลิตเครื่องยนต์อากาศยาน "
        ,"บิวอิคก์ หรือ บูอิค เป็นยี่ห้อรถยนต์ระดับหรูของสหรัฐอเมริกาในเครือเจเนรัลมอเตอร์ รถยนต์บิวอิคก์มีจำหน่ายอย่างเป็นทางการในสหรัฐอเมริกา แคนาดา เม็กซิโก จีน และอิสราเอล" +
                " บิวอิคก์ขึ้นชื่อเป็นยี่ห้อรถยนต์ที่เก่าแก่ที่สุดในสหรัฐอเมริกาที่ยังคงอยู่ รถยนต์ของบิวอิคก์เกือบทุกรุ่นยังมีส่วนคล้ายกับรถยนต์จากยี่ห้ออื่น ๆ"
        ,"แปลจากภาษาอังกฤษ-BRABUS GmbH ก่อตั้งขึ้นในปี 1977 ในเมือง Bottrop ประเทศเยอรมนีเป็น " +
                "บริษัท ที่ดำเนินการปรับแต่งสมรรถนะสูงประสิทธิภาพสูงซึ่งเชี่ยวชาญในรถยนต์เมอร์เซเดส - เบนซ์สมาร์ทและเมย์บัค Brabus " +
                "กลายเป็นเครื่องรับ Mercedes ที่ใหญ่ที่สุดนอกเหนือจาก Mercedes-AMG ซึ่งกลายเป็น บริษัท ในเครือของ Daimler AG ในปี 1990"
        ,"รถยนต์ Ettore Bugatti เป็นผู้ผลิตรถยนต์สัญชาติฝรั่งเศสที่มีรถยนต์สมรรถนะสูงก่อตั้งขึ้นในปี 1909 ในเมือง Molsheim ประเทศเยอรมันนี Alsace" +
                " โดยนักออกแบบอุตสาหกรรมชาวอิตาเลียน Ettore Bugatti รถคันนี้เป็นที่รู้จักเนื่องจากความงามของการออกแบบและสำหรับชัยชนะในการแข่งขันหลายครั้ง" +
                " Bugattis ที่มีชื่อเสียง ได้แก่ Type 35 Grand"
        ,"เป็นบริษัทผลิตรถยนต์ในสหรัฐอเมริกา ในปัจจุบันเป็นส่วนหนึ่งของเจนเนอรัล มอเตอร์ส เชฟโรเลตมีชื่อย่ออย่างไม่เป็นทางการว่า" +
                " เชฟวี (Chevy) เชฟโรเลตผลิตรถยนต์ออกมาหลายรุ่น โดยรุ่นที่นิยมมากของเชฟโรเลตคือ อิมพาลา และ คอร์เวตต์ ในปี พ.ศ. 2548 " +
                "ในสหรัฐอเมริกา เชฟโรเลตทำยอดขายเอาชนะคู่แข่งฟอร์ด เป็นครั้งแรกในรอบ 19 ปี ","คาดิลแลค (อังกฤษ: Cadillac)" +
                " เป็นชื่อบริษัทผลิตรถยนต์ระดับหรูของสหรัฐอเมริกา ในเครือเจเนรัลมอเตอร์ รถยนต์คาดิลแลคมีจำหน่ายอย่างเป็นทางการในประเทศต่างๆ มากกว่า 50 ประเทศทั่วโลก " +
                "โดยจำหน่ายได้มากในสหรัฐอเมริกาและแคนาดา ","คอนิกเส็กก์ ออโตโมทีฟ เอบี เป็นบริษัทรถยนต์สัญชาติสวีเดน มีฐานการผลิตใหญ่อยู่ที่ Ängelholm เน้นการผลิตรถยนต์สมรรถนะสูง"
        ,"เฟอร์รารี่ เป็นบริษัทผลิตรถสปอร์ตจากเมืองมาราเนลโล ประเทศอิตาลี ก่อตั้งในปี ค.ศ. 1929 มีเอ็นโซ เฟอร์รารี่เป็นผู้ก่อตั้ง โดยมีจุดเริ่มต้นจากการเป็นทีมแข่งรถของอัลฟาโรเมโอ " +
                "โดยใช้ชื่อว่า สคูเดอเรีย เฟอร์รารี่ ซึ่งในตอนที่ทำงานอยู่กับอัลฟาโรเมโอนั้น เอ็นโซเองก็เป็นทั้งวิศวกรและนักแข่งรถด้วย"
        ,"ฟอร์ด มอเตอร์ (อังกฤษ: Ford Motor Company) หรือเรียกย่อว่า ฟอร์ด บริษัทผลิตรถยนต์รายใหญ่ของโลกตั้งอยู่ที่รัฐมิชิแกน ก่อตั้งโดยเฮนรี ฟอร์ด ปัจจุบันเป็นผู้ผลิตรถยนต์อันดับ 2 ของโลก รองจาก" +
                " เจเนรัลมอเตอร์ ฟอร์ดมอเตอร์เป็นเจ้าของยี่ห้อรถยนต์ต่างๆ ได้แก่ ฟอร์ด, ลิงคอล์น (Lincoln), เมอร์คิวรี (Mercury) " +
                "และวอลโว่ (เฉพาะในส่วนของรถยนต์เท่านั้น สำหรับยี่ห้อวอลโว่ในส่วนของรถเพื่อการพานิชย์ (รถบรรทุก รถโดยสาร และเครื่องจักรกลหนัก) ยังคงเป็นกิจการของทางวอลโว่เอง) " +
                "แต่ฟอร์ดมอเตอร์ได้ขายวอลโว่ให้กับบริษัท Geely Automobile แล้วในปี 2010[1] นอกจากนี้ยังเข้าไปถือหุ้นในกิจการของบริษัทรถยนต์ของญี่ปุ่นอย่างมาสด้า "
        ,"Fiat S.p.A. หรือ Fabbrica Italiana Automobili Torino เป็น บริษัท ผู้ถือหุ้นชาวอิตาเลียนซึ่งมีกิจกรรมดั้งเดิมและเป็นแกนหลักอยู่ในอุตสาหกรรมยานยนต์และประสบความสำเร็จด้วย " +
                "Fiat Chrysler Automobiles NV Fiat Group มีแบรนด์มากมายเช่น Ferrari, Maserati, Fiat, Alfa Romeo" +
                ", Chrysler Group และอื่น ๆ อีกมากมาย"
        ,"Apollo Automobil เป็นผู้ผลิตรถยนต์สปอร์ตเยอรมันซึ่งมีสำนักงานใหญ่ในเดนเคนดอร์ฟ Roland Gumpert" +
                " ผู้ก่อตั้งอพอลโลเคยดำรงตำแหน่งผู้อำนวยการของ Audi Sport ภายใต้การบริหารของเขา Audi ได้รับรางวัลการแข่งขันแรลลี่ชิงแชมป์โลกทั้งหมด 25 " +
                "ครั้งและแชมป์เวิลด์แรลลี่ชิงแชมป์โลกสี่ครั้ง","Ginetta Cars เป็นผู้เชี่ยวชาญด้านการผลิตรถแข่งและกีฬาในอังกฤษ Garforth, Leeds, West Yorkshire"
        ,"ฮอนด้า มอเตอร์ หรือ บริษัท อุตสาหกรรมและวิจัยฮอนด้า มหาชนจำกัด เป็นบริษัทผู้ผลิต และจำหน่ายรถยนต์จากประเทศญี่ปุ่น โดยมีผลิตภัณฑ์ รถยนต์ รถบรรทุก จักรยานยนต์ และเครื่องจักรอุตสาหกรรมหนักอีกหลายประเภท ฮอนด้ามีสำนักงานใหญ่อยู่ที่กรุงโตเกียว ประเทศญี่ปุ่น")
    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle ("Car Histrory")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = ArrayAdapter(context,android.R.layout.simple_expandable_list_item_1,addArray)
        lv_car.adapter = mAdapter
        lv_car.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(context,
                "position = ${position} , data = ${detailArr[position]}"
                        ,Toast.LENGTH_LONG).show()
        }
    }
}
