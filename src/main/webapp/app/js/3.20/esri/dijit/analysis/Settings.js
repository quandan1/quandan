// All material copyright ESRI, All Rights Reserved, unless otherwise specified.
// See http://js.arcgis.com/3.20/esri/copyright.txt for details.
//>>built
require({cache:{"url:esri/dijit/analysis/templates/Settings.html":'\x3cdiv class\x3d"esriAnalysis"\x3e\r\n  \x3cdiv\x3e\r\n    \x3cdiv class\x3d"analysisTitle" style\x3d"padding:1em;" data-dojo-attach-point\x3d"_settingsHeader"\x3e\r\n         \x3ctable class\x3d"esriFormTable"\x3e\r\n            \x3ctr\x3e\r\n              \x3ctd class\x3d"esriAlignLeading esriAnalysisTitle" colspan\x3d"2"\x3e\r\n                \x3clabel data-dojo-attach-point\x3d"_analysisTitle"\x3e${i18n.analysisEnv}\x3c/label\x3e\r\n              \x3c/td\x3e\r\n              \x3ctd\x3e\r\n                \x3cdiv class\x3d"esriFloatTrailing" style\x3d"padding:0;"\x3e\r\n                    \x3cdiv class\x3d"esriFloatTrailing" data-dojo-attach-point\x3d"_closeDiv"\x3e\r\n                      \x3ca href\x3d"#" data-dojo-attach-point\x3d"_closeBtn" title\x3d"${i18n.close}" class\x3d"esriAnalysisCloseIcon"\x3e\x3c/a\x3e\r\n                    \x3c/div\x3e\r\n                \x3c/div\x3e\r\n              \x3c/td\x3e\r\n            \x3c/tr\x3e\r\n         \x3c/table\x3e\r\n    \x3c/div\x3e\r\n   \x3cdiv style\x3d"clear:both; border-bottom: #CCC thin solid; height:1px;width:100%;"\x3e\x3c/div\x3e\r\n  \x3c/div\x3e\r\n  \x3cdiv data-dojo-type\x3d"dijit/form/Form" data-dojo-attach-point\x3d"_form" readOnly\x3d"true"\x3e\r\n     \x3ctable class\x3d"esriFormTable"\x3e\r\n       \x3ctbody\x3e\r\n         \x3ctr data-dojo-attach-point\x3d"_overwriteRow"\x3e\r\n           \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriSelectLabel esriLeadingMargin1"\x3e\r\n               \x3cinput type\x3d"radio" data-dojo-attach-point\x3d"_overwriteCheck" data-dojo-type\x3d"dijit/form/CheckBox" data-dojo-props\x3d"checked:false" name\x3d"overwriteResult" value\x3d"false"/\x3e\r\n                ${i18n.overwriteResultLayer}\r\n             \x3c/label\x3e\r\n           \x3c/td\x3e\r\n             \x3ctd class\x3d"shortTextInput" \x3e\r\n               \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' data-dojo-attach-point\x3d"_analysisFieldHelpLink" esriHelpTopic\x3d"overwriteResult"\x3e\x3c/a\x3e\r\n            \x3c/td\x3e\r\n         \x3c/tr\x3e\r\n         \x3ctr data-dojo-attach-point\x3d"_closeAnalysisRow"\x3e\r\n           \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriSelectLabel esriLeadingMargin1"\x3e\r\n               \x3cinput type\x3d"radio" data-dojo-attach-point\x3d"_closeAnalysisCheck" data-dojo-type\x3d"dijit/form/CheckBox" data-dojo-props\x3d"checked:false" name\x3d"overwriteResult" value\x3d"false"/\x3e\r\n                ${i18n.closeAnalysisWisget}\r\n             \x3c/label\x3e\r\n           \x3c/td\x3e\r\n             \x3ctd class\x3d"shortTextInput" \x3e\r\n               \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' data-dojo-attach-point\x3d"_analysisFieldHelpLink" esriHelpTopic\x3d"closeAnalysisWidget"\x3e\x3c/a\x3e\r\n            \x3c/td\x3e\r\n         \x3c/tr\x3e\r\n         \x3ctr data-dojo-attach-point\x3d"_storeAnalysisRow"\x3e\r\n           \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriSelectLabel esriLeadingMargin1"\x3e\r\n               \x3cinput type\x3d"radio" data-dojo-attach-point\x3d"_storeAnalysisCheck" data-dojo-type\x3d"dijit/form/CheckBox" data-dojo-props\x3d"checked:false" name\x3d"storeAnalysisResults" value\x3d"false"/\x3e\r\n                ${i18n.storeAnalysisResults}\r\n             \x3c/label\x3e\r\n           \x3c/td\x3e\r\n             \x3ctd class\x3d"shortTextInput" \x3e\r\n               \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' data-dojo-attach-point\x3d"_analysisFieldHelpLink" esriHelpTopic\x3d"storeAnalysisResults"\x3e\x3c/a\x3e\r\n            \x3c/td\x3e\r\n         \x3c/tr\x3e\r\n         \x3ctr data-dojo-attach-point\x3d"_coordinateLblRow"\x3e\r\n            \x3ctd class\x3d"esriAlignLeading esriAnalysisTitle" colspan\x3d"3" \x3e\r\n               \x3clabel class\x3d"esriAnalysisStepsLabel"\x3e${i18n.CoordinateSys}\x3c/label\x3e\r\n            \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_outSRLblRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin1"\x3e${i18n.outSR}\x3c/label\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd class\x3d"shortTextInput"\x3e\r\n            \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' esriHelpTopic\x3d"outputCoordinateSystem"\x3e\x3c/a\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_outSRRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3cselect  class\x3d"esriLeadingMargin1 longInput esriLongLabel"  data-dojo-type\x3d"dijit/form/Select" data-dojo-attach-point\x3d"_outSRSelect" data-dojo-attach-event\x3d"onChange:_handleSRSelectChange"\x3e\r\n               \x3coption value\x3d"DEFAULT"\x3e${i18n.defaultExtentLabel}\x3c/option\x3e\r\n               \x3coption value\x3d"SPECIFIED"\x3e${i18n.extentSpecfiedBelow}\x3c/option\x3e\r\n            \x3c/select\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd style\x3d"width:15%"\x3e\r\n            \x3cdiv data-dojo-type\x3d"dijit/form/ToggleButton"  data-dojo-props\x3d"showLabel:false,iconClass:\'esriAnalysisSRIcon\'" data-dojo-attach-point\x3d"_outSRBtn" data-dojo-attach-event\x3d"onChange:_handleOutSRBtnClick"\x3e\x3c/div\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_outSRCustomRow" style\x3d"display:none;"\x3e\r\n          \x3ctd colspan\x3d"3"\x3e\r\n           \x3clabel class\x3d"esriLeadingMargin2"\x3e${i18n.spatialReference}\x3c/label\x3e\r\n           \x3cinput style\x3d"width:20%;" class\x3d"mediumInput esriMediumLabel" type\x3d"text" data-dojo-props\x3d"constraints: {pattern: \'######\', places: 0}" data-dojo-attach-point\x3d"_outSRInput" data-dojo-type\x3d"dijit/form/NumberTextBox" data-dojo-attach-event\x3d"onChange:_handleOutSRInputChange"\x3e\x3c/input\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_outSRCustomInputRow" style\x3d"display:none;"\x3e\r\n          \x3ctd colspan\x3d"3"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin2" data-dojo-attach-point\x3d"_outSRLabel"\x3e\x3c/label\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_processSRLblRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin1"\x3e${i18n.processSR}\x3c/label\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd class\x3d"shortTextInput"\x3e\r\n            \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' esriHelpTopic\x3d"processingCoordinateSystem"\x3e\x3c/a\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_processSRRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3cselect  class\x3d"esriLeadingMargin1 longInput esriLongLabel"  data-dojo-type\x3d"dijit/form/Select" data-dojo-attach-point\x3d"_processSRSelect" data-dojo-attach-event\x3d"onChange:_handleProcessSRSelectChange"\x3e\r\n               \x3coption value\x3d"DEFAULT"\x3e${i18n.defaultExtentLabel}\x3c/option\x3e\r\n               \x3coption value\x3d"SPECIFIED"\x3e${i18n.extentSpecfiedBelow}\x3c/option\x3e\r\n            \x3c/select\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd style\x3d"width:15%"\x3e\r\n            \x3cdiv data-dojo-type\x3d"dijit/form/ToggleButton" class\x3d"esriFloatLeading" data-dojo-props\x3d"showLabel:false,iconClass:\'esriAnalysisSRIcon\'" data-dojo-attach-point\x3d"_processSRBtn" data-dojo-attach-event\x3d"onChange:_handleProcessSRBtnClick"\x3e\x3c/div\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_processSRCustomRow" style\x3d"display:none;"\x3e\r\n          \x3ctd colspan\x3d"3"\x3e\r\n           \x3clabel class\x3d"esriLeadingMargin2"\x3e${i18n.spatialReference}\x3c/label\x3e\r\n           \x3cinput style\x3d"width:20%;" class\x3d"mediumInput esriMediumLabel" type\x3d"text" data-dojo-props\x3d"constraints: {pattern: \'######\', places: 0}" data-dojo-attach-point\x3d"_processSRInput" data-dojo-type\x3d"dijit/form/NumberTextBox" data-dojo-attach-event\x3d"onChange:_handleProcessSRInputChange"\x3e\x3c/input\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_processSRCustomInputRow" style\x3d"display:none;"\x3e\r\n          \x3ctd colspan\x3d"3"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin2" data-dojo-attach-point\x3d"_processSRLabel"\x3e\x3c/label\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n         \x3ctr data-dojo-attach-point\x3d"_processExtLblRow"\x3e\r\n            \x3ctd class\x3d"esriAlignLeading esriAnalysisTitle" colspan\x3d"3" \x3e\r\n               \x3clabel class\x3d"esriAnalysisStepsLabel"\x3e${i18n.processExtent}\x3c/label\x3e\r\n            \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_extentLblRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin1"\x3e${i18n.extent}\x3c/label\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd class\x3d"shortTextInput"\x3e\r\n            \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' esriHelpTopic\x3d"processingExtent"\x3e\x3c/a\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_extentRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3cselect  class\x3d"esriLeadingMargin1 longInput esriLongLabel"  data-dojo-type\x3d"dijit/form/Select" data-dojo-attach-point\x3d"_extentSelect" data-dojo-attach-event\x3d"onChange:_handleExtentOptionChange"\x3e\r\n               \x3coption value\x3d"DEFAULT"\x3e${i18n.defaultLabel}\x3c/option\x3e\r\n               \x3coption value\x3d"DISPLAY"\x3e${i18n.extentAsDisplay}\x3c/option\x3e\r\n               \x3coption value\x3d"SPECIFIED"\x3e${i18n.extentSpecfiedBelow}\x3c/option\x3e\r\n            \x3c/select\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_extentLbl"\x3e\r\n          \x3ctd style\x3d"padding:0" colspan\x3d"2"\x3e\r\n            \x3cdiv class\x3d"esriLeadingMargin1"\x3e\r\n              \x3clabel class\x3d"esriSmallLabel"\x3e${i18n.enterCoords}\x3c/label\x3e\r\n            \x3c/div\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_customExtentRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3ctable class\x3d"esriLeadigMargin1 esriFormTable" style\x3d"width:90%;"\x3e\r\n              \x3ctr\x3e\r\n                \x3ctd\x3e\r\n                  \x3clabel class\x3d""\x3e${i18n.xMin}\x3c/label\x3e\r\n                  \x3cinput type\x3d"text" class\x3d"mediumInput" style\x3d"width:65%;" data-dojo-attach-point\x3d"_xMinInput" data-dojo-type\x3d"dijit/form/NumberTextBox"\x3e\x3c/input\x3e\r\n                \x3c/td\x3e\r\n               \x3ctd\x3e\r\n                  \x3clabel\x3e${i18n.xMax}\x3c/label\x3e\r\n                  \x3cinput type\x3d"text" class\x3d"mediumInput" style\x3d"width:65%;" data-dojo-attach-point\x3d"_xMaxInput" data-dojo-type\x3d"dijit/form/NumberTextBox"\x3e\x3c/input\x3e\r\n                \x3c/td\x3e\r\n              \x3c/tr\x3e\r\n              \x3ctr\x3e\r\n                \x3ctd\x3e\r\n                  \x3clabel class\x3d""\x3e${i18n.yMin}\x3c/label\x3e\r\n                  \x3cinput type\x3d"text" class\x3d"mediumInput" style\x3d"width:65%;" data-dojo-attach-point\x3d"_yMinInput" data-dojo-type\x3d"dijit/form/NumberTextBox"\x3e\x3c/input\x3e\r\n                \x3c/td\x3e\r\n               \x3ctd\x3e\r\n                  \x3clabel\x3e${i18n.yMax}\x3c/label\x3e\r\n                  \x3cinput type\x3d"text" class\x3d"mediumInput" style\x3d"width:65%;" data-dojo-attach-point\x3d"_yMaxInput" data-dojo-type\x3d"dijit/form/NumberTextBox"\x3e\x3c/input\x3e\r\n                \x3c/td\x3e\r\n              \x3c/tr\x3e\r\n           \x3c/table\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_snapLblRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin1"\x3e${i18n.snapRaster}\x3c/label\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd class\x3d"shortTextInput"\x3e\r\n            \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' esriHelpTopic\x3d"snapRaster"\x3e\x3c/a\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_snapSelRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3cselect  class\x3d"esriLeadingMargin1 longInput esriLongLabel"  data-dojo-type\x3d"dijit/form/Select" data-dojo-attach-point\x3d"_snapRasterSelect" data-dojo-attach-event\x3d"onChange:_handleSnapRasterSelectChange"\x3e\x3c/select\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_rasterLblRow"\x3e\r\n            \x3ctd class\x3d"esriAlignLeading esriAnalysisTitle" colspan\x3d"3" \x3e\r\n               \x3clabel  class\x3d"esriAnalysisStepsLabel"\x3e${i18n.rasterLabel}\x3c/label\x3e\r\n            \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_cellLblRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin1"\x3e${i18n.cellSize}\x3c/label\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd class\x3d"shortTextInput"\x3e\r\n            \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' esriHelpTopic\x3d"cellSize"\x3e\x3c/a\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_cellSelectRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3cselect  class\x3d"esriLeadingMargin1 longInput esriLongLabel"  data-dojo-type\x3d"dijit/form/Select" data-dojo-attach-point\x3d"_cellSizeSelect" data-dojo-attach-event\x3d"onChange:_handleCellSizeSelectChange"\x3e\x3c/select\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_cellSelectNumRow" style\x3d"display:none;"\x3e\r\n          \x3ctd colspan\x3d"3"\x3e\r\n           \x3cinput style\x3d"width:20%;" class\x3d"esriLeadingMargin1 mediumInput esriMediumLabel" type\x3d"text" data-dojo-props\x3d"value:1,constraints: {pattern: \'######\', places: 0}" data-dojo-attach-point\x3d"_cellSizeInput" data-dojo-type\x3d"dijit/form/NumberTextBox" data-dojo-attach-event\x3d"onChange:_handleCellSizeInputChange"\x3e\x3c/input\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_maskLblRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3clabel class\x3d"esriLeadingMargin1"\x3e${i18n.mask}\x3c/label\x3e\r\n          \x3c/td\x3e\r\n          \x3ctd class\x3d"shortTextInput"\x3e\r\n            \x3ca href\x3d"#" class\x3d\'esriFloatTrailing helpIcon\' esriHelpTopic\x3d"mask"\x3e\x3c/a\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n        \x3ctr data-dojo-attach-point\x3d"_maskSelRow"\x3e\r\n          \x3ctd colspan\x3d"2"\x3e\r\n            \x3cselect  class\x3d"esriLeadingMargin1 longInput esriLongLabel"  data-dojo-type\x3d"dijit/form/Select" data-dojo-attach-point\x3d"_maskSelect" data-dojo-attach-event\x3d"onChange:_handleMaskSelectChange"\x3e\x3c/select\x3e\r\n          \x3c/td\x3e\r\n        \x3c/tr\x3e\r\n      \x3c/tbody\x3e\r\n     \x3c/table\x3e\r\n    \x3c/div\x3e\r\n    \x3cdiv class\x3d"esriFormWarning esriRoundedBox" data-dojo-attach-point\x3d"_errorMessagePane" style\x3d"display:none;"\x3e\r\n        \x3ca href\x3d"#" title\x3d"${i18n.close}" class\x3d"esriFloatTrailing esriAnalysisCloseIcon" title\x3d\'${i18n.close}\' data-dojo-attach-event\x3d"onclick:_handleCloseMsg"\x3e\r\n        \x3c/a\x3e\r\n        \x3cspan data-dojo-attach-point\x3d"_bodyNode"\x3e\x3c/span\x3e\r\n    \x3c/div\x3e\r\n    \x3cdiv data-dojo-type\x3d"dijit/ConfirmDialog" class\x3d"esriAnalysisStgSpatialDialog" title\x3d"${i18n.coordSysDialogTitle}" data-dojo-props\x3d"closable:false" data-dojo-attach-point\x3d"_coordDialog" style\x3d"width:40em;" data-dojo-attach-event\x3d"onExecute:_handleSRDlgOk,onCancel:_handleSRDlgCancel"\x3e\r\n      \x3cdiv data-dojo-attach-point\x3d"_spatialRefGridNode"\x3e\x3c/div\x3e\r\n    \x3c/div\x3e\r\n    \x3cdiv  class\x3d"esriFloatTrailing" data-dojo-attach-point\x3d"_actionbuttonCtr"\x3e\r\n      \x3cdiv data-dojo-type\x3d"dijit/form/Button"  class\x3d"${cssClass.primaryButton}" data-dojo-attach-point\x3d"_addBtn" data-dojo-attach-event\x3d"onClick:_handleOkButtonClick"\x3e\r\n        ${i18n.apply}\r\n      \x3c/div\x3e\r\n       \x3cdiv data-dojo-type\x3d"dijit/form/Button" class\x3d"${cssClass.button}" data-dojo-attach-point\x3d"_closeBtn" data-dojo-attach-event\x3d"onClick:_handleCancelButtonClick"\x3e\r\n        ${i18n.cancel}\r\n      \x3c/div\x3e\r\n    \x3c/div\x3e\r\n\x3c/div\x3e\r\n'}});
define("esri/dijit/analysis/Settings","require dojo/_base/declare dojo/_base/lang dojo/_base/array dojo/_base/connect dojo/_base/Color dojo/_base/json dojo/has dojo/json dojo/string dojo/dom-style dojo/dom-attr dojo/dom-construct dojo/query dojo/dom-class dojo/NodeList dojo/NodeList-dom dojo/_base/fx dojo/fx/easing dojo/Evented dijit/_TemplatedMixin dijit/_WidgetsInTemplateMixin dijit/_OnDijitClickMixin dijit/_FocusMixin dijit/registry dijit/form/Button dijit/form/CheckBox dijit/form/Form dijit/form/Select dijit/form/TextBox dijit/form/ToggleButton dijit/form/ValidationTextBox dijit/layout/ContentPane dijit/form/FilteringSelect dijit/Dialog dijit/ConfirmDialog dojox/mvc/at dgrid1/OnDemandGrid dgrid1/Tree dgrid1/Editor dgrid1/Keyboard dgrid1/Selection dgrid1/Selector dgrid1/extensions/ColumnResizer dgrid1/extensions/DijitRegistry ../../kernel ../../lang ../../geometry/Extent ../../SpatialReference ../../layers/ArcGISImageServiceLayer ./_Widget ./utils ./SettingsViewModel dojo/i18n!../../nls/jsapi dojo/text!./templates/Settings.html".split(" "),
function(h,t,e,g,u,P,Q,v,R,S,k,f,T,w,l,U,V,m,n,W,x,y,z,A,X,Y,Z,aa,ba,ca,da,ea,fa,ga,ha,ia,ja,B,C,D,E,F,G,H,I,J,ka,p,q,K,L,c,M,r,N){var O=t([B,E,F,G,D,C,H,I]);h=L.createSubclass([x,y,z,A],{declaredClass:"esri.dijit.analysis.Settings",templateString:N,widgetsInTemplate:!0,i18n:null,toolName:"Settings",helpFileName:"AnalysisEnvironments",viewModelType:M,cssClass:{primaryButton:"btn calcite blue",button:"btn calcite"},constructor:function(a,b){this._pbConnects=[];a.containerNode&&(this.container=a.containerNode);
this.cssClass=e.mixin({},this.cssClass)},destroy:function(){this.inherited(arguments);g.forEach(this._pbConnects,u.disconnect);delete this._pbConnects},postMixInProperties:function(){this.inherited(arguments);this.i18n={};e.mixin(this.i18n,r.common);e.mixin(this.i18n,r.analysisSettings);this._initModelWatchers()},postCreate:function(){this.inherited(arguments);this.initUI()},startup:function(){this._spatialRefGrid.startup()},initUI:function(){this._rasterUX=[this._snapLblRow,this._snapSelRow,this._rasterLblRow,
this._cellLblRow,this._cellSelectRow,this._cellSelectNumRow,this._maskLblRow,this._maskSelRow];this._extentUX=[this._processExtLblRow,this._extentLblRow,this._extentRow];this._coordSysUX=[this._processSRRow,this._processSRLblRow,this._outSRLblRow,this._outSRRow,this._coordinateLblRow];c.initHelpLinks(this.domNode,this.viewModel.showHelp);c.updateDisplay(this._rasterUX,this.viewModel.showRasterSettings,"table-row");c.updateDisplay([this._overwriteRow],this.viewModel.showOverwriteResultOption,"table-row");
c.updateDisplay([this._closeAnalysisRow],this.viewModel.showCloseAnalysisOption,"table-row");c.updateDisplay([this._storeAnalysisRow],this.viewModel.showStoreAnalysisOption,"table-row");c.updateDisplay(this._coordSysUX,this.viewModel.showCoordinateSystems,"table-row");c.updateDisplay([this._processSRRow,this._processSRLblRow],this.viewModel.showProcessSR,"table-row");c.updateDisplay([this._outSRLblRow,this._outSRRow],this.viewModel.showOutSR,"table-row");c.updateDisplay(this._extentUX,this.viewModel.showExtent,
"table-row");c.updateDisplay([this._closeDiv],this.viewModel.showCloseIcon,"block");c.updateDisplay([this._settingsHeader],this.viewModel.showHeader,"block");c.updateDisplay([this._actionbuttonCtr],this.viewModel.showOkCancel,"block");this._spatialRefGrid||(this._spatialRefGrid=new O({collection:this.viewModel.spatialRefStore,id:this.id+"_settingsgrid",showHeader:!1,columns:[{renderExpando:!0,label:"Name",field:"name",sortable:!1,resizable:!0}],"class":"esriAnalysisSpatialRefTree"},this._spatialRefGridNode),
w(".dijitButton",this._coordDialog.domNode).forEach(function(a,b){0===b?l.add(a,this.cssClass.primaryButton):l.add(a,this.cssClass.button)},this));this.viewModel.outSR&&this._outSRInput.set("value",this.viewModel.outSR.wkid);this.viewModel.processSR&&this._processSRInput.set("value",this.viewModel.processSR.wkid);this.viewModel.layers&&this._updateLayerOptions(this.viewModel.layers);this._extentSelect.set("value",this.viewModel.get("isCustomExtent")?"SPECIFIED":"DEFAULT");this._outSRSelect.set("value",
this.viewModel.get("isCustomOutSR")?"SPECIFIED":"DEFAULT");this._processSRSelect.set("value",this.viewModel.get("isCustomProcessSR")?"SPECIFIED":"DEFAULT");this.showOutSR&&this._handleSRSelectChange(this._outSRSelect.get("value"));this.showProcessSR&&this._handleProcessSRSelectChange(this._processSRSelect.get("value"));this.viewModel.get("isCustomExtent")&&this.viewModel.extent&&(this._xMinInput.set("value",this.viewModel.extent.xmin),this._xMaxInput.set("value",this.viewModel.extent.xmax),this._yMinInput.set("value",
this.viewModel.extent.ymin),this._yMaxInput.set("value",this.viewModel.extent.ymax));this._handleExtentOptionChange(this._extentSelect.get("value"));this._cellSizeSelect.set("value",this.viewModel.get("isCustomCellSize")?"SPECIFIED":this._cellSizeSelect.get("value"));this.viewModel.get("isCustomCellSize")&&this.viewModel.cellSize&&this._cellSizeInput.set("value",this.viewModel.cellSize);this._handleCellSizeSelectChange(this._cellSizeSelect.get("value"));this._handleSnapRasterSelectChange(this._snapRasterSelect.get("value"));
this._handleMaskSelectChange(this._maskSelect.get("value"))},_initModelWatchers:function(){this.own(this.viewModel.watch("showCloseIcon",e.hitch(this,function(a,b,d){c.updateDisplay([this._closeDiv],d,"block")})),this.viewModel.watch("showHelp",e.hitch(this,function(a,b,d){c.initHelpLinks(this.domNode,d)})),this.viewModel.watch("showOverwriteResultOption",e.hitch(this,function(a,b,d){c.updateDisplay([this._overwriteRow],d,"table-row")})),this.viewModel.watch("showCloseAnalysisOption",e.hitch(this,
function(a,b,d){c.updateDisplay([this._closeAnalysisRow],d,"table-row")})),this.viewModel.watch("showStoreAnalysisOption",e.hitch(this,function(a,b,d){c.updateDisplay([this._storeAnalysisRow],d,"table-row")})),this.viewModel.watch("showCoordinateSystems",e.hitch(this,function(a,b,d){c.updateDisplay(this._coordSysUX,d,"table-row")})),this.viewModel.watch("showProcessSR",e.hitch(this,function(a,b,d){c.updateDisplay([this._processSRRow,this._processSRLblRow],d,"table-row");this._handleProcessSRSelectChange(this._processSRSelect.get("value"))})),
this.viewModel.watch("showOutSR",e.hitch(this,function(a,b,d){c.updateDisplay([this._outSRLblRow,this._outSRRow],d,"table-row");this._handleSRSelectChange(this._outSRSelect.get("value"))})),this.viewModel.watch("showExtent",e.hitch(this,function(a,b,d){c.updateDisplay(this._extentUX,d,"table-row");d&&this._handleExtentOptionChange(this._extentSelect.get("value"))})),this.viewModel.watch("showRasterSettings",e.hitch(this,function(a,b,d){c.updateDisplay(this._rasterUX,d,"table-row");this._handleCellSizeSelectChange(this._cellSizeSelect.get("value"));
this._handleSnapRasterSelectChange(this._snapRasterSelect.get("value"));this._handleMaskSelectChange(this._maskSelect.get("value"))})),this.viewModel.watch("layers",e.hitch(this,function(a,b,c){this._updateLayerOptions(this.viewModel.layers)})),this.viewModel.watch("showHeader",e.hitch(this,function(a,b,d){c.updateDisplay([this._settingsHeader],d,"block")})),this.viewModel.watch("showOkCancel",e.hitch(this,function(a,b,d){c.updateDisplay([this._actionbuttonCtr],d,"block")})))},_handleSRSelectChange:function(a){this._coordDialog.hide();
this._outSRBtn.set("disabled","SPECIFIED"!==a);c.updateDisplay(this._outSRCustomRow,"SPECIFIED"===a&&this.viewModel.showOutSR,"table-row");c.updateDisplay(this._outSRCustomInputRow,"SPECIFIED"===a&&this.viewModel.showOutSR,"table-row");this._outSRInput.set("required","SPECIFIED"===a);-1!==a.indexOf("LAYER_")&&(a=a.split("_")[1],a=this.viewModel.layers[a],this.viewModel.showOkCancel?this._outSR={wkid:parseInt(a.fullExtent.spatialReference.wkid,10)}:this.viewModel.set("outSR",{wkid:parseInt(a.fullExtent.spatialReference.wkid,
10)}))},_handleProcessSRSelectChange:function(a){this._coordDialog.hide();this._processSRBtn.set("disabled","SPECIFIED"!==a);c.updateDisplay(this._processSRCustomRow,"SPECIFIED"===a&&this.viewModel.showProcessSR,"table-row");c.updateDisplay(this._processSRCustomInputRow,"SPECIFIED"===a&&this.viewModel.showProcessSR,"table-row");this._processSRInput.set("required","SPECIFIED"===a);-1!==a.indexOf("LAYER_")&&(a=a.split("_")[1],a=this.viewModel.layers[a],this.viewModel.showOkCancel?this._processSR={wkid:parseInt(a.fullExtent.spatialReference.wkid,
10)}:this.viewModel.set("processSR",{wkid:parseInt(a.fullExtent.spatialReference.wkid,10)}))},_handleOutSRBtnClick:function(){this._outSRClick=!0;this._coordDialog.show()},_handleProcessSRBtnClick:function(){this._outSRClick=!1;this._coordDialog.show()},_handleExtentOptionChange:function(a){var b="SPECIFIED"===a;c.updateDisplay([this._extentLbl,this._customExtentRow],this.viewModel.showExtent&&b,"table-row");this._xMinInput.set("required",b);this._xMaxInput.set("required",b);this._yMinInput.set("required",
b);this._yMaxInput.set("required",b);-1!==a.indexOf("LAYER_")?(a=a.split("_")[1],a=this.viewModel.layers[a],this.viewModel.showOkCancel?this._extent=a.fullExtent.shiftCentralMeridian():this.viewModel.set("extent",a.fullExtent.shiftCentralMeridian())):"SPECIFIED"===a?(a=new p(this._xMinInput.get("value"),this._yMinInput.get("value"),this._xMaxInput.get("value"),this._yMaxInput.get("value"),new q({wkid:102100})),this.viewModel.showOkCancel?this._extent=a:this.viewModel.set("extent",a)):"DEFAULT"===
a&&(this._extent=null)},_handleSRDlgOk:function(){var a,b;for(b in this._spatialRefGrid.get("selection"))this._spatialRefGrid.get("selection").hasOwnProperty(b)&&(a=b);a=this._spatialRefGrid.collection.getSync(a);b=a.sRef.wkid;this.viewModel.showOkCancel?this._outSRClick?this._outSR={wkid:parseInt(b,10)}:this._processSR={wkid:parseInt(b,10)}:this.viewModel.set(this._outSRClick?"outSR":"processSR",{wkid:parseInt(b,10)});this._outSRClick?this._outSRInput.textbox.value=b:this._processSRInput.textbox.value=
b;this._outSRClick?f.set(this._outSRLabel,"innerHTML",a.name):f.set(this._processSRLabel,"innerHTML",a.name)},_handleSRDlgCancel:function(){},_handleOutSRInputChange:function(a){a&&(f.set(this._outSRLabel,"innerHTML",""),c.updateDisplay([this._outSRLabel],!1,"inline"),this.viewModel.showOkCancel?this._outSR={wkid:parseInt(a,10)}:this.viewModel.set("outSR",{wkid:parseInt(a,10)}))},_handleProcessSRInputChange:function(a){a&&(f.set(this._processSRLabel,"innerHTML",""),c.updateDisplay([this._processSRLabel],
!1,"inline"),this.viewModel.showOkCancel?this._processSR={wkid:parseInt(a,10)}:this.viewModel.set("processSR",{wkid:parseInt(a,10)}))},_handleCellSizeSelectChange:function(a){c.updateDisplay([this._cellSelectNumRow],"SPECIFIED"===a&&this.viewModel.showRasterSettings,"table-row");-1!==a.indexOf("LAYER_")?(a=this._cellSizeSelect.getOptions(a),this.viewModel.showOkCancel?this._cellSize={url:a.url}:this.viewModel.set("cellSize",{url:a.url})):"SPECIFIED"===a?this.viewModel.showOkCancel?this._cellSize=
this._cellSizeInput.get("value"):this.viewModel.set("cellSize",this._cellSizeInput.get("value")):this.viewModel.showOkCancel?this._cellSize=a:this.viewModel.set("cellSize",a)},_handleSnapRasterSelectChange:function(a){-1!==a.indexOf("LAYER_")?(a=this._snapRasterSelect.getOptions(a),this.viewModel.showOkCancel?this._snapRaster={url:a.url}:this.viewModel.set("snapRaster",{url:a.url})):this.viewModel.showOkCancel?this._snapRaster="NONE"===a?void 0:a:this.viewModel.set("snapRaster","NONE"===a?void 0:
a)},_handleMaskSelectChange:function(a){-1!==a.indexOf("LAYER_")?(a=this._maskSelect.getOptions(a),this.viewModel.showOkCancel?this._mask={url:a.url}:this.viewModel.set("mask",{url:a.url})):this.viewModel.showOkCancel?this._mask="NONE"===a?void 0:a:this.viewModel.set("mask","NONE"===a?void 0:a)},_handleCellSizeInputChange:function(a){a&&"SPECIFIED"===this._cellSizeSelect.get("value")&&(this.viewModel.showOkCancel?this._cellSize=a:this.viewModel.set("cellSize",a))},_updateLayerOptions:function(a){var b=
g.map(a,function(a,b){return{value:"LAYER_"+b,label:"Layer "+a.name,url:a.url}},this),c=[{value:"minof",label:this.i18n.minInputs},{value:"maxof",label:this.i18n.maxInputs,selected:!0},{value:"SPECIFIED",label:this.i18n.extentSpecfiedBelow}],e=[{value:"DEFAULT",label:this.i18n.defaultLabel},{value:"SPECIFIED",label:this.i18n.extentSpecfiedBelow}],f;f=[].concat([{value:"DEFAULT",label:this.i18n.defaultExtentLabel},{value:"SPECIFIED",label:this.i18n.extentSpecfiedBelow}]).concat(b);e=[].concat(e).concat(b);
a=g.filter(a,function(a){return a instanceof K});a=[].concat(g.map(a,function(a,b){return{value:"LAYER_"+b,label:"Layer "+a.name,url:a.url}},this));this._outSRSelect.removeOption(this._outSRSelect.getOptions());this._processSRSelect.removeOption(this._processSRSelect.getOptions());this._extentSelect.removeOption(this._extentSelect.getOptions());this._maskSelect.removeOption(this._maskSelect.getOptions());this._cellSizeSelect.removeOption(this._cellSizeSelect.getOptions());this._snapRasterSelect.removeOption(this._snapRasterSelect.getOptions());
this._outSRSelect.addOption(f);this._processSRSelect.addOption(f);this._extentSelect.addOption(e);this._extentSelect.set("value",this.viewModel.get("isCustomExtent")?"SPECIFIED":"DEFAULT");this._maskSelect.addOption([{value:"NONE",label:""}].concat(b));this._cellSizeSelect.addOption([].concat(c).concat(b));this._snapRasterSelect.addOption([{value:"NONE",label:""}].concat(a))},_handleOkButtonClick:function(){this._form.validate()&&(this.viewModel.set("outSR",this._outSR),this.viewModel.set("processSR",
this._processSR),this.viewModel.set("isCustomExtent","SPECIFIED"===this._extentSelect.get("value")),this.viewModel.set("isCustomOutSR","SPECIFIED"===this._outSRSelect.get("value")),this.viewModel.set("isCustomProcessSR","SPECIFIED"===this._processSRSelect.get("value")),this.viewModel.set("isCustomCellSize","SPECIFIED"===this._cellSizeSelect.get("value")),"SPECIFIED"===this._extentSelect.get("value")&&(this._extent=new p(this._xMinInput.get("value"),this._yMinInput.get("value"),this._xMaxInput.get("value"),
this._yMaxInput.get("value"),new q({wkid:102100}))),this.viewModel.set("extent",this._extent),this.viewModel.set("mask",this._mask),this.viewModel.set("snapRaster",this._snapRaster),this.viewModel.set("cellSize",this._cellSize),this.viewModel.save(),this.emit("ok-settings",{viewMode:this.viewModel}))},_handleCancelButtonClick:function(){this._form.reset();this.viewModel.reset();this.reset();this.emit("cancel-settings",{viewMode:this.viewModel})},reset:function(){this.initUI()},_showMessages:function(a){f.set(this._bodyNode,
"innerHTML",a);m.fadeIn({node:this._errorMessagePane,easing:n.quadIn,onEnd:e.hitch(this,function(){k.set(this._errorMessagePane,{display:""})})}).play()},_handleCloseMsg:function(a){a&&a.preventDefault();m.fadeOut({node:this._errorMessagePane,easing:n.quadOut,onEnd:e.hitch(this,function(){k.set(this._errorMessagePane,{display:"none"})})}).play()}});v("extend-esri")&&e.setObject("dijit.analysis.Settings",h,J);return h});