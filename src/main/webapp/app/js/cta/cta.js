$(document).ready(function() {
	
	function getTree() {
		var tree = [ {
			text : "Parent 1",
			nodes : [ {
				text : "Child 1",
			}, {
				text : "Child 2"
			} ]
		}];
		return tree;
	}

	$('#tree').treeview({
		data : getTree(),
		multiSelect : true		
	});
});
