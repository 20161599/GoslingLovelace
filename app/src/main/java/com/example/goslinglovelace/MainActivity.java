package com.example.goslinglovelace;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String language=getResources().getConfiguration().locale.getLanguage();
        int orientation=getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.lovelace);
            if(language.equals("zh")){
                ((TextView)findViewById(R.id.textView2)).setText("奥古斯塔·阿达·金");
                ((TextView)findViewById(R.id.textView3)).setText("奥古斯塔·阿达·金，洛夫蕾丝伯爵夫人（N_e Byron；1815年12月10日至1852年11月27日）是英国数学家和作家，主要以其在查尔斯·巴贝奇提出的通用机械计算机分析机上的工作而闻名。她是第一个认识到这台机器的应用超出了纯计算，并发表了第一个打算由这种机器执行的算法。因此，她有时被认为是第一个认识到“计算机”的全部潜力的人，也是最早的计算机程序员之一。              Lovelace是诗人拜伦勋爵和他的妻子Anne Isabella“Annabella”Milbanke，温特沃斯夫人的唯一合法孩子。【5】拜伦的所有其他孩子都是非婚生的，都是其他女人生的。【6】拜伦在艾达出生一个月后与妻子分居，四个月后永远离开英国。他用一首诗来纪念离别，“你的脸像你母亲的美丽的孩子吗？艾达！我的家和心的独生女？”【7】阿达八岁时，在希腊独立战争中死于疾病。她的母亲仍然很苦恼，并促进了艾达对数学和逻辑的兴趣，以防止她发展她父亲的精神错乱。尽管如此，艾达仍然对拜伦很感兴趣，并在拜伦死后，应拜伦的请求埋葬在他旁边。她小时候经常生病。艾达于1835年与威廉·金结婚。1838年，国王被任命为洛夫蕾丝伯爵，艾达因此成为洛夫蕾丝伯爵夫人。              她的教育和社会功绩使她与安德鲁·克罗斯、戴维·布鲁斯特爵士、查尔斯·惠斯通、迈克尔·法拉第和作家查尔斯·狄更斯等科学家取得了联系，她曾与这些科学家接触，以促进她的教育。Ada把她的方法描述为“诗学”，而她自己则是“分析者（和形而上学者）”。[9]              在她十几岁的时候，她的数学天赋使她与英国数学家查尔斯·巴贝奇（Charles Babbage）建立了长期的工作关系和友谊，也被称为“计算机之父”，尤其是巴贝奇在分析机上的工作。1833年6月，洛夫蕾丝通过他们共同的朋友和她的私人导师玛丽·萨默维尔第一次见到了他。              1842年至1843年间，Ada翻译了意大利军事工程师Luigi Menabrea的一篇关于计算引擎的文章，并补充了一套精妙的注释，简称为注释。这些注释包含许多人认为是第一个计算机程序的内容，也就是一种由机器执行的算法。其他历史学家反对这种观点，并指出巴贝奇1836/1837年的个人笔记中包含了第一个引擎程序。她还发展了计算机能力的远见，不仅限于计算或数字处理，而包括巴贝奇本人在内的许多其他人，只关注这些能力。【11】她对“诗学”的看法使她提出了有关分析引擎的问题（如她笔记中所示），研究个人和社会的关系。将技术作为一种协作工具。              她于1852年死于子宫癌，享年36岁。");
            }
        }else if(orientation== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
            if(language.equals("zh")){
                ((TextView)findViewById(R.id.textView)).setText("詹姆斯 戈斯丁");
                ((TextView)findViewById(R.id.textgosling)).setText("詹姆斯 戈斯丁获得了卡尔加里大学的理学学士学位[4]和卡耐基梅隆大学的硕士和博士学位，全部是计算机科学[2][5][6]他在攻读博士学位的同时，写了一个名为Gosling Emacs（Gosmacs）的Emacs版本。他在卡内基梅隆大学（Carnegie Mellon University）期间，在加入Sun Microsystems之前，为16路计算机系统[7]构建了一个多处理器版本的Unix。他还开发了一些编译器和邮件系统。              1984年至2010年（26年）期间，高斯林与太阳微系统合作。他被称为Java编程语言之父。〔8〕〔9〕，他通过将Pyq Q代码翻译成VAX汇编程序并模拟硬件来编写程序来从Pyq编写端口软件，从而获得Java VM的思想。他于2010年4月2日离开Sun Microsystems，此前该公司被甲骨文公司收购，[8]引用了薪酬、地位和决策能力的降低，以及角色和道德挑战的变化[10]之后，他在采访中对甲骨文采取了非常关键的立场，并指出“在Sun和Oracle的整合会议期间”E，当我们被问到Sun和谷歌之间的专利情况时，我们可以看到甲骨文律师的眼睛闪闪发光。”[9]他在甲骨文诉谷歌安卓的审判中澄清了自己的立场：“虽然我和甲骨文有分歧，但在本案中，他们是对的。谷歌完全缩小了太阳。我们都很不安，连乔纳森·施瓦茨也不例外；他只是决定装出一副高兴的样子，试图把柠檬变成柠檬水，这让很多人对太阳感到恼火。”[11]然而，他同意法院的判决，即原料药不应享有版权。2011年3月，戈斯林离开甲骨文在谷歌工作[13]6个月后，他跟随他的同事Bill Vass加入了一家名为Liquid Robotics的初创公司[1]2016年末，波音收购了Liquid Robotics[14]收购后，戈斯林于2017年5月离开Liquid Robotics在亚马逊网络服务公司担任杰出工程师。");
            }
        }




    }
}
