<div>
	<a class="easyui-linkbutton" onclick="importIndex();">一键导入商品数据到索引库</a>
</div>
<script type="text/javascript">
function importIndex(){
	$.getJSON("/search/import/index",function(data){
		if(data.status == 200){
			$.messager.alert('提示','导入索引库成功!');
		}else{
			$.messager.alert('提示','导入索引库失败!');
		}
	});
}
</script>