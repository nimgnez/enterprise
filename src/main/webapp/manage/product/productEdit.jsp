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
    Map<String, String> statuss = new LinkedHashMap<String, String>();
    statuss.put("0", "不上线");
    statuss.put("1", "上线");
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
                <td style="text-align: left;">
                    <select id="categoryId" name="categoryId">
                        <c:forEach var="item" items="<%=SystemManage.getInstance().getProductCategory()%>">
                            <option value="${item.id}"
                                    <c:if test="${e.categoryId eq item.id}">selected="selected" </c:if>>${item.catename}</option>
                        </c:forEach>
                    </select>
                </td>
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
                <th style="text-align: right;">主图片</th>
                <td style="text-align: left;"><input type="text" size="40"
                                                     id="image" name="image" value="${e.image}"
                />
                    <input type="button" name="imageFile" value="选择图片" class="btn btn-primary"
                           style="padding: 0px 12px;margin-top: -5px;"/>
                </td>
            </tr>


            <tr>
                <th style="text-align: right;">缩略图一</th>
                <td style="text-align: left;"><input type="text" size="40"
                                                     id="image1" name="image1" value="${e.image1}"
                />
                    <input type="button" name="imageFile1" value="选择图片" class="btn btn-primary"
                           style="padding: 0px 12px;margin-top: -5px;"/>
                </td>
            </tr>

            <tr>
                <th style="text-align: right;">缩略图二</th>
                <td style="text-align: left;"><input type="text" size="40"
                                                     id="image2" name="image2" value="${e.image2}"
                />
                    <input type="button" name="imageFile2" value="选择图片" class="btn btn-primary"
                           style="padding: 0px 12px;margin-top: -5px;"/>
                </td>
            </tr>

            <tr>
                <th style="text-align: right;">缩略图三</th>
                <td style="text-align: left;"><input type="text" size="40"
                                                     id="image3" name="image3" value="${e.image3}"
                />
                    <input type="button" name="imageFile3" value="选择图片" class="btn btn-primary"
                           style="padding: 0px 12px;margin-top: -5px;"/>
                </td>
            </tr>

            <tr>
                <th style="text-align: right;">缩略图四</th>
                <td style="text-align: left;"><input type="text" size="40"
                                                     id="image4" name="image4" value="${e.image4}"
                />
                    <input type="button" name="imageFile4" value="选择图片" class="btn btn-primary"
                           style="padding: 0px 12px;margin-top: -5px;"/>
                </td>
            </tr>
            <tr>
                <th style="text-align: right;">外型尺寸</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.externalDim}" name="externalDim"
                                                     id="externalDim"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">外型尺寸-英尺</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.externalE}" name="externalE"
                                                     id="externalE"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">内径尺寸</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.internalDim}" name="internalDim"
                                                     id="internalDim"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">内径尺寸-英尺</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.internalE}" name="internalE"
                                                     id="internalE"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品重量</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.weight}" name="weight"
                                                     id="weight"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品重量-英镑</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.weightE}" name="weightE"
                                                     id="weightE"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品体积</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.volumn}" name="volumn"
                                                     id="volumn"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品体积-加仑</th>
                <td style="text-align: left;"><input type="text" size="30" value="${e.volumnE}" name="volumnE"
                                                     id="volumnE"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品库存</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.sku}" name="sku"
                                                     id="sku"/></td>
            </tr>
            <tr>
                <th style="text-align: right;">产品标签</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.tags}" name="tags"
                                                     id="tags"/></td>
            </tr>

            <tr>
                <th style="text-align: right;">产品关键词</th>
                <td style="text-align: left;"><input type="text" size="40" value="${e.keywords}"
                                                     name="keywords"
                                                     id="keywords"/></td>
            </tr>

            <tr>
                <th style="text-align: right;">是否上线</th>
                <td style="text-align: left;">
                    <select name="status">
                        <c:forEach var="entry" items="<%=statuss %>">
                            <option value="${entry.key}"
                                    <c:if test="${e.status eq entry.key}">selected="selected" </c:if>>${entry.value}</option>
                        </c:forEach>
                    </select>
                </td>
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


    var content;
    KindEditor.ready(function (K) {
        content = K.create('textarea[name="content"]', {
            filterMode: false,
            allowFileManager: true,
            uploadJson: '<%=path%>/resource/kindeditor/jsp/upload_json.jsp',
            fileManagerJson: '<%=path%>/resource/kindeditor/jsp/file_manager_json.jsp'

        });
        var editor = K.editor({
            allowFileManager: true,
            uploadJson: '<%=path%>/resource/kindeditor/jsp/upload_json.jsp',
            fileManagerJson: '<%=path%>/resource/kindeditor/jsp/file_manager_json.jsp'
        });

        K('input[name=getHtml]').click(function (e) {
            alert(editor.html());
        });
        K('input[name=isEmpty]').click(function (e) {
            alert(editor.isEmpty());
        });
        K('input[name=getText]').click(function (e) {
            alert(editor.text());
        });
        K('input[name=selectedHtml]').click(function (e) {
            alert(editor.selectedHtml());
        });
        K('input[name=setHtml]').click(function (e) {
            editor.html('<h3>Hello KindEditor</h3>');
        });
        K('input[name=setText]').click(function (e) {
            editor.text('<h3>Hello KindEditor</h3>');
        });
        K('input[name=insertHtml]').click(function (e) {
            editor.insertHtml('<strong>插入HTML</strong>');
        });
        K('input[name=appendHtml]').click(function (e) {
            editor.appendHtml('<strong>添加HTML</strong>');
        });
        K('input[name=imageFile]').click(function () {
            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    imageUrl: K('#image').val(),
                    clickFn: function (url) {
                        K('#image').val(url);
                        editor.hideDialog();
                    }
                });
            });
        });


        K('input[name=imageFile1]').click(function () {
            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    imageUrl: K('#image1').val(),
                    clickFn: function (url) {
                        K('#image1').val(url);
                        editor.hideDialog();
                    }
                });
            });
        });

        K('input[name=imageFile2]').click(function () {
            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    imageUrl: K('#image2').val(),
                    clickFn: function (url) {
                        K('#image2').val(url);
                        editor.hideDialog();
                    }
                });
            });
        });


        K('input[name=imageFile3]').click(function () {
            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    imageUrl: K('#image3').val(),
                    clickFn: function (url) {
                        K('#image3').val(url);
                        editor.hideDialog();
                    }
                });
            });
        });

        K('input[name=imageFile4]').click(function () {
            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    imageUrl: K('#image4').val(),
                    clickFn: function (url) {
                        K('#image4').val(url);
                        editor.hideDialog();
                    }
                });
            });
        });

        K('input[name=clear]').click(function (e) {
            editor.html('');
        });

    });

    function commit(obj) {
        var _form = $("form");
        _form.attr("action", $(obj).attr("method"));
        _form.submit();
    }
</script>


<%@ include file="/manage/system/baseFoot.jsp" %>
