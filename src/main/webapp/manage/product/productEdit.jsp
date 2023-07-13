<%--
  Created by IntelliJ IDEA.
  User: Cesiumai
  Date: 2016/6/14
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/manage/system/pageBase.jsp" %>
<%@ page info="产品列表" %>
<%
    Map<String,String> statuss = new LinkedHashMap<String,String>();
    statuss.put("y","显示");
    statuss.put("n","不显示");
%>
<form action="<%=path %>/manage/product" name="form" id="form" method="post">
    <div style="height:auto!important;height:550px;min-height:550px;">
        <h3 style="border-bottom: 1px solid #D7D7D7;color: #666666;font-size: 28px;padding-bottom: 20px;margin-bottom: 30px;">
            <%=getServletInfo()%>
            <a href="<%=path %>/manage/product/selectList" class="btn btn-primary"
               style="padding: 2px 15px;float:right;"><i class="icon-double-angle-left"></i>返回列表</a>
        </h3>
        <table width="100%" border="0" cellspacing="0" cellpadding="10" class="tableBasic">
            <tr style="display: none;">
                <td>id</td>
                <td><input type="hidden" value="${e.id}" name="id" label="id"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品分类</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.category}" name="category"
                                                     data-rule="产品型号:required;category;length[1~45];"
                                                     id="category"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品型号</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.modelNo}" name="modelNo"
                                                     data-rule="产品型号:required;modelNo;length[1~45];"
                                                     id="modelNo"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品标题</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.title}" name="title"
                                                    data-rule="产品型号:required;title;length[1~45];"
                                                    id="title"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品外型尺寸</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.externalDim}" name="externalDim"
                                                     id="externalDim"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品内径尺寸</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.internalDim}" name="internalDim"
                                                     id="internalDim"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品重量</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.weight}" name="weight"
                                                     id="weight"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品体积</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.volumn}" name="volumn"
                                                     id="volumn"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品库存</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.sku}" name="sku"
                                                     id="sku"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品标签</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.tags}" name="tags"
                                                     id="tags"/></td>
            </tr>

            <tr>
                <th style="text-align: right;">产品兴趣链接</th>
                <td style="text-align: left;"><input type="text" size="80" value="${e.interestetLink}" name="interestetLink"
                                                     id="interestetLink"/></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;">
                    <c:choose>
                        <c:when test="${e.id!=0}">
                            <button method="update" onclick="commit(this)" class="btn btn-info"
                                    style="padding:2px 15px;">
                                保存
                            </button>
                        </c:when>
                        <c:otherwise>
                            <button method="insert" onclick="commit(this)" class="btn btn-info"
                                    style="padding:2px 15px;">
                                新增
                            </button>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </table>
    </div>
</form>

<script type="text/javascript">


        K('input[name=imageFile]').click(function() {
            editor.loadPlugin('image', function() {
                editor.plugin.imageDialog({
                    imageUrl : K('#image').val(),
                    clickFn : function(url) {
                        K('#image').val(url);
                        editor.hideDialog();
                    }
                });
            });
        });

    function commit(obj) {
        var _form = $("form");
        _form.attr("action", $(obj).attr("method"));
        _form.submit();
    }
</script>


<%@ include file="/manage/system/baseFoot.jsp" %>
