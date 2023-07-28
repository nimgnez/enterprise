<%--
  Created by IntelliJ IDEA.
  User: Cesiumai
  Date: 2016/6/14
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/manage/system/pageBase.jsp" %>
<%@ page info="询价信息" %>

<div style="height:auto!important;height:550px;min-height:550px;">


    <table class="table table-bordered table-hover table-striped">
        <tr>
            <th width="300">产品型号</th>
            <th>产品数量</th>
            <th>客户昵称</th>
            <th>客户邮件</th>
            <th>创建时间</th>
            <th width="200">操作</th>
        </tr>
        <c:forEach var="item" items="${pager.list}">
            <tr>
                <td>${item.productModel}</td>
                <td>${item.quantity}</td>
                <td>${item.name}</td>
                <td>${item.email}</td>
                <td>${item.createTime}</td>
                <td><a href="toEdit?id=${item.id}">查看</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="71" style="text-align: center;">
                <%@ include file="/manage/system/page.jsp" %>
            </td>
        </tr>
    </table>
</div>


<%@ include file="/manage/system/baseFoot.jsp" %>