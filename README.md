# Java_project
This project is a prototype of a program that simulates an insurance buying software. Users can manage insurance agreements, receive new applications, track financials, and more.
Features:
Insurance Agreements

    Users can store up to 20 insurance agreements, each containing:
        Client name
        Yearly fee
        Risk (Yearly chance of accident, 5% to 100%)
        Insurance amount (5x to 20x yearly fee)
        Constructor that randomly generates these values

Display Menu

    Shows the total amount of money
    Options include:
        Receive new applications
        See all current insurance agreements
        See financial breakdown
        Break insurance agreements
        Move time forward

Menu to See New Insurance Applications

    Displays 6 applications
    Users can accept an application, removing it from the menu

Menu to See All Insurance Agreements

    Displays all insurance agreements in a formatted manner
    Shows the net profit for each insurance agreement

Option to See Financial Breakdown

    Shows:
        Total payouts from claims
        Total payouts from canceled agreements
        Total income made
        Breakdown of net profit per year
        Average net profit

Option to Break Agreements

    Displays all agreements
    Users can choose an agreement to break
    Requires payment of 10x the yearly fee
    Broken agreement is removed from the collection

Option to Move Time Forward

    Advances time by one year, increasing the year value
    All agreements pay their annual fee, increasing user money
    Randomly checks if agreements make a claim based on the risk value
        Displays claims made and money earned
