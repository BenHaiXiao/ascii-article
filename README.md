#  ascii-article

当初市面上很多markdown编辑器，列如atom，Typora，IntelliJ IDEA 本身也自带有markdown编辑功能，如是脑洞大开
想开发一款属于自己的markdown编辑器，如是有了上面这点东东，不是很完善但是有了一点点基础的功能。后续如果有机会会继续更新，
目前时间先开发到这里了。有兴趣的可以继续，我会定期合并代码

## 目前支持功能

1. 文本编辑
2. Markdown编辑
3. Html编辑，（写了一个模型）

## 模型简介

一篇文章的组成 Article ,主要有标题title，作者author，创建时间createTime，段落Paragraph组成，
段落具有多样性，可能为列表，可能为图文，可能为其他。。。。。。
目前段落抽象为如下：
1. 有序列表 OrderedList 
2. 表格  Table
3. 文本，Text ，支持6级标题和正文
4. 无序列表 UnorderedList


##  初期效果 
   ![](http://empfs.bs2dl.yy.com/bWQtMTUyMDIyOTg1NTk2MjhfMTUyMDIyOTg1NTk2Mg.png)  