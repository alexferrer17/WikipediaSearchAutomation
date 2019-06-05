import geb.Browser

Browser.drive {

    go "http://google.com/"

    //make sure the tittle is google
    assert title=="Google"

    //enter wikipedia on the search bar
    $("input",name:"q").value("wikipedia.com")

    //wait for the page the reload again
    waitFor{ title.endsWith("Google Search")}

    //check if the first line is the one we want
    def firstLink = $("li.g,0").find("a.l")

    assert firstLink.text() == "Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation."

    //click on the selector
    firstLink.click()

    //wait for Google to enter wikipedia
    waitFor { title == "Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation."}

    $("input",name:"a").value("MVVM")

    //def reference = $()

    //assert reference =


}