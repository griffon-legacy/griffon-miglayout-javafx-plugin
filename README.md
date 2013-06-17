
MigLayout JavaFX integration
----------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/miglayout-javafx](http://artifacts.griffon-framework.org/plugin/miglayout-javafx)


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

