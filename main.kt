import tornadofx.*
import javafx.scene.paint.Color
import javafx.scene.control.TextField
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ScrollPane
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import javafx.geometry.Pos
import javafx.stage.Popup
import javafx.scene.control.Alert
import javafx.scene.control.TextArea

class MainScreen : View() {
    private val qlist = listOf(
        "Hur länge har Du lidit av Ditt nuvarande besvär?",
        "Hur mycket smärta har Du haft den senaste veckan?",
        "Jag kan utföra lättare arbete under en timme.",
        "Jag kan sova på natten.",
        "Hur spänd eller stressad har du känt Dig den senaste veckan?",
        "I vilken utsträckning har du känt dig nedstämd den senaste veckan?",
        "Som Du upplever det själv, hur stor är risken att ditt nuvarande besvär skulle bli långvarigt?",
        "Hur stor chans tror DU att Du har att kunna arbeta om tre månader?",
        "Om besvären ökar, är det en signal på att jag bör sluta med det jag håller på med, tills besvären minskar.",
        "Jag bör inte utföra mina normala aktiviteter eller arbeten med den smärta jag har för närvarande."
    )

    private val dscrptn = listOf(
        listOf("0-1 veckor", "1-2 veckor", "3-4 veckor", "4-5 veckor", "6-8 veckor", "9-11 veckor", "3-6 månader", "6-9 månader", "9-12 månader", "Över ett år"),
        listOf("0 Ingen smärta.", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10 Svårast tänkbara smärta"),
        // Add similar lists for other questions
    )

    private val valuetuple = IntArray(10)
    private val bttns = IntArray(10)
    private var bigheight: Double = 0.0
    private val fontheight = 15.0
    private val linelen = 30.0
    private var nownr: Int = 0

    init {
        planupdate()
    }

    override val root = vbox {
        paddingAll = 10.0
        alignment = Pos.CENTER

        scrollpane {
            hbarPolicy = ScrollPane.ScrollBarPolicy.NEVER
            vbox {
                planupdate()
            }
        }

        button(">>") {
            action {
                Submit()
            }
        }
    }

    private fun planupdate() {
        // Implement the planupdate function
    }

    private fun radiobox(i: Int, j: Int) {
        // Implement the radiobox function
    }

    private fun chng_bttn(number: Int) {
        // Implement the chng_bttn function
    }

    private fun settings() {
        // Implement the settings function
    }

    private fun Submit() {
        // Implement the Submit function
    }

    private fun change_mail(theaddress: String, popup1: Popup) {
        // Implement the change_mail function
    }

    private fun send_mail(themessage: String, popup1: Popup) {
        // Implement the send_mail function
    }
}

class OntApp : App(MainScreen::class)

fun main() {
    launch<OntApp>()
}
