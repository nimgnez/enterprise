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
<%@ page info="产品询价" %>

<form action="<%=path %>/manage/inquiry" name="form" id="form" method="post">
    <div style="height:auto!important;height:550px;min-height:550px;">
        <h3 style="border-bottom: 1px solid #D7D7D7;color: #666666;font-size: 28px;padding-bottom: 20px;margin-bottom: 30px;">
            <%=getServletInfo()%>
            <a href="<%=path %>/manage/inquiry/selectList" class="btn btn-primary"
               style="padding: 2px 15px;float:right;"><i class="icon-double-angle-left"></i>返回列表</a>
        </h3>
        <table width="100%" border="0" cellspacing="0" cellpadding="10" class="tableBasic">

            <tr style="display: none;">
                <td>id</td>
                <td><input type="text" value="${e.id}" name="id" label="id"/></td>
            </tr>
            <tr>
                <th style="text-align: right;" width="200">产品型号</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.productModel}" name="productModel"
                                                     id="productModel"/></td>
            </tr>
            <tr>
                <th style="text-align: right;" width="200">产品数量</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.quantity}" name="quantity" id="code"
                                                     />
                </td>
            </tr>
            <tr>
                <th style="text-align: right;" width="200">客户昵称</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.name}" name="name" id="name"
                                                     />
                </td>
            </tr>
            <tr>
                <th style="text-align: right;" width="200">客户邮件</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.email}" name="email" id="email"
                                                   />
                </td>
            </tr>
            <tr>
                <th style="text-align: right;">询价信息</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.message}" name="message"
                                                     id="message"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">创建时间</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.createTime}" name="createTime"
                                                     id="createTime"/></td>
            </tr>

<%--            <tr>--%>
<%--                <td colspan="2" style="text-align: center;">--%>
<%--                    <c:choose>--%>
<%--                        <c:when test="${e.id!=0}">--%>
<%--                            <button method="update" onclick="commit(this)" class="btn btn-info"--%>
<%--                                    style="padding:2px 15px;">--%>
<%--                                保存--%>
<%--                            </button>--%>
<%--                        </c:when>--%>
<%--                        <c:otherwise>--%>
<%--                            <button method="insert" onclick="commit(this)" class="btn btn-info"--%>
<%--                                    style="padding:2px 15px;">--%>
<%--                                新增--%>
<%--                            </button>--%>
<%--                        </c:otherwise>--%>
<%--                    </c:choose>--%>
<%--                </td>--%>
<%--            </tr>--%>
        </table>
    </div>
</form>
<script type="text/javascript" src="<%=path%>/resource/js/MooTools-Core-1.6.0.js"></script>
<script type="text/javascript" src="<%=path%>/resource/js/pinyin.js"></script>
<script type="text/javascript">


    // function commit(obj) {
    //
    //     var _form = $("form");
    //     _form.attr("action", $(obj).attr("method"));
    //     _form.submit();
    // }
</script>
<%@ include file="/manage/system/baseFoot.jsp" %>
