#  ascii-article
当初市面上很多markdown编辑器，列如atom，Typora，IntelliJ IDEA 本身也自带有markdown编辑功能，如是脑洞大开
想开发一款属于自己的markdown编辑器，如是有了上面这点东东，不是很完善但是基础的功能都有了。后续如果有机会会继续更新，
目前时间先开发到这里了。有兴趣的可以继续，我会定期合并代码
## 目前支持功能
1. Article，文章的编辑
2. Text，文本编辑
3. OrderedList，列表编辑

## 已经完成的功能
1. 模型，一篇文章此处命名为Article，由 标题 title，段落，作者，创建时间等等部分组成。段落是啥，怎么组成，比较复杂有志者，这里预留接口，种类多样方便扩展。

Article {
    private String title;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private String author;
    private Date createTime;
 }

2. 初期效果 

      ![](http://empfs.bs2dl.yy.com/bWQtMTUyMDIyOTg1NTk2MjhfMTUyMDIyOTg1NTk2Mg.png)  