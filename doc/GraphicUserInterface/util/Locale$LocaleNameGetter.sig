 mnemonic Q style push      � 148 dynamic  �  ;    class 2org.eclipse.ui.ExtensionFactory:showInContribution id &org.eclipse.ui.menus.dynamicShowInMenu      � 148 visibleWhen  �  �    checkEnabled false     �  � 148 and  �           �  �  � 148 or  �  3         �  �  � 148 with  �  ]    variable 
activePart     �  �  � 148 
instanceof  �  �    value 9org.eclipse.ui.internal.views.markers.ExtendedMarkersView      � 148 test  �      args &org.eclipse.ui.ide.allMarkersGenerator property #org.eclipse.ui.ide.contentGenerator      � 148 with  �  �    variable 
activePart     �  �  � 148 
instanceof  �  �    value 9org.eclipse.ui.internal.views.markers.ExtendedMarkersView      � 148 test  �  <    args $org.eclipse.ui.ide.problemsGenerator property #org.eclipse.ui.ide.contentGenerator      � 148 with  �  �    variable 	selection     �  � 148 iterate  �  �    ifEmpty false operator and     �  � 148 adapt  �  G    type "org.eclipse.core.resources.IMarker   