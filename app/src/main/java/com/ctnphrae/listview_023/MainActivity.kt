package com.ctnphrae.listview_023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf(
        "สับปะรด",
        "มะพร้าว",
        "มะนาว",
        "กล้วย",
        "เสาวรส",
        "หม่อน",
        "กระท้อน",
        "แอปเปิ้ล",
        "ส้ม",
        "ฝรั่ง",
        "แตงโม",
        "ทุเรียน",
        "เชอร์รี่",
        "กีวี่",
        "มะม่วง",
        "อะโวคาโด",
        "มังคุด",
        "แก้วมังกร",
        "มะม่วงหาวมะนาวโห่",
        "อินทผลัม"
    )
    val detailArr = arrayOf(
        "สับปะรด มีต้นกำเนิดมาจากทวีปอเมริกาใต้ มีความทนทานต่อสภาพแวดล้อมต่าง ๆ ได้ดี ",
        "มะพร้าว เป็นผลไม้ที่นิยมกันอย่างมากในบ้านเรา คุณสมบัติเด่น ๆ ของมะพร้าวก็คือ ส่วนต่าง ๆ สามารถนำมาใช้ทำเป็นประโยชน์ได้หมด ไม่ว่าจะทำเป็นอาหารคาวหวานเพื่อบำรุงสุขภาพและรักษาอาการหรือโรคต่าง ๆ",
        "มะนาว แก้อาเจียน เป็นลมวิงเวียนศีรษะ เมาเหล้าได้",
        "กล้วย ช่วยเพิ่มพลังให้แก่สมองของคุณ เพราะมีสารที่ช่วยทำให้มีเกิดสมาธิและมีการตื่นตัวตลอดเวลา",
        "เสาวรส ช่วยในการชะลอวัย ชะลอการเกิดริ้วรอยแห่งวัยด้วยสารต่อต้านอนุมูลอิสระ",
        "หม่อน ใบใช้ต้มกับน้ำดื่มเป็นยาแก้ไข้ ไข้หวัด ตัวร้อน แก้ร้อนในกระหายน้ำ และเป็นยาช่วยขับลมร้อน",
        "กระท้อน เป็นผลไม้ที่มีธาตุโพแทสเซียมสูง จึงไม่ค่อยเหมาะนักสำหรับผู้ที่ป่วยเป็นโรคไต",
        "แอปเปิ้ล เป็นอาหารที่เหมาะอย่างยิ่งสำหรับผู้ป่วยภาวะเลือดเป็นกรด ไขข้อรูมาติก โรคเกาต์ ดีซ่าน",
        "ส้ม น้ำส้มใช้ดื่มแก้กระหาย เพิ่มความสดชื่นให้แก่ร่างกาย เพิ่มความกระปรี้กระเปร่า",
        "ฝรั่ง เป็นผลไม้เพื่อสุขภาพที่เหมาะมากสำหรับผู้ที่ต้องการลดความอ้วน ลดน้ำหนัก หรือผู้ที่กำลังควบคุมน้ำหนัก",
        "แตงโม ช่วยบำรุงผิวพรรณและเส้นผมให้แข็งแรง เพราะประกอบไปด้วยวิตามินและแร่ธาตุหลายชนิด",
        "ทุเรียน เปลือกทุเรียนสามารถนำมาใช้เป็นเชื้อเพลิงในการรมควันปลา",
        "เชอร์รี่ เป็นผลไม้ที่นิยมซื้อมารับประทานสด ๆ หรือจะนำไปคั้นเป็นน้ำเชอร์รี่ก็ได้ หรือจะนำไปทำขนมต่าง ๆ",
        "กีวี มีสารต่อต้านอนุมูลอิสระสูง จึงช่วยชะลอวัยและการเกิดริ้วรอยแห่งวัย",
        "มะม่วง เนื้อไม้ของต้นมะม่วง สามารถนำมาใช้ทำเป็นเฟอร์นิเจอร์ได้",
        "อะโวคาโด ช่วยบำรุงและรักษาสายตาได้",
        "มังคุด รับประทานสดเป็นผลไม้หรือทำเป็นน้ำผลไม้อย่าง น้ำมังคุดและน้ำเปลือกมังคุด",
        "แก้วมังกร ช่วยบำรุงผิวพรรณให้เปล่งปลั่ง สดใส ชุ่มชื่น",
        "มะม่วงหาวมะนาวโห่ มะม่วงหาวมะนาวโห่มีสารต่อต้านอนุมูลอิสระ จึงช่วยในการชะลอวัยและริ้วรอย",
        "อินทผลัม ช่วยรักษาโรคผอมผิดปกติ ช่วยเพิ่มน้ำหนักตัว"
    )
    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ข้อมูลผลไม้")
        val mAdapter = ArrayAdapter(
            context,
            android.R.layout.simple_list_item_1,
            titleArr
        )
        lv_lime.adapter = mAdapter
        lv_lime.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                context,
                "ชื่อ = ${titleArr[position]} , ข้อมูล = ${detailArr[position]}"
                , Toast.LENGTH_LONG).show()
        }
    }
}
