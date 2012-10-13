/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class MiglayoutJavafxGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.1.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [javafx: '0.8']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['javafx']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-miglayout-javafx-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'MigLayout JavaFX integration'
    String description = '''
Provides integration with [MigLayout][1] and JavaFX.

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*        | *Type*                                    |
| ------------- | ----------------------------------------- |
| migLayoutPane | `griffon.plugins.miglayout.MigLayoutPane` |

This node supports the following properties

 * **layoutConstraints** - defines general constraints
 * **columnConstraints** - defines constraints applicable to columns only
 * **rowConstraints** - defines constraints applicable to rows only

The plugin includes a copy of the MigLayout white-paper in PDF format. Refer also to the [MigLayout Cheatsheet][2] 
to know more about what constraints can be used with this layout.

### Example

The `migLayoutPane` node can be used as any other layout node inside a Griffon View, for example

    application(title: 'Sample', sizeToScene: true, centerOnScreen: true) {
        scene(fill: WHITE, width: 300, height: 120) {
            migLayoutPane(layoutConstraints: 'fill') {
                label 'Username:', constraints: 'left'
                textField constraints: 'grow, wrap'
                label 'Password:', constraints: 'left'
                passwordField constraints: 'grow, wrap'
                button loginAction, constraints: 'span 2, right'
            }
        }
    }

[1]: http://www.miglayout.com
[2]: http://migcalendar.com/miglayout/cheatsheet.html
'''
}
