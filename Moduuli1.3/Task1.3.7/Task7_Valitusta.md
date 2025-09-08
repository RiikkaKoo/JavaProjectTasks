#TASK 7: AJATUKSIA

Tämän tehtävän ohjeistus oli aika hämmentävä, joten en ole ihan varma toteutinko tehtävän oikein.

The test program generates arrival events as above: i.e., 10 events are created to the event list. Finally, (in this test program), the clock displays the time of the last event created.

Once all events are created, they are all processed sequentially (the clock is not moved here). Customers are created to the Service Point queue as the events are processed (dig each event out of the list one by one). Each event time is marked as a customer arrival time.

The clock is then moved forward slightly, e.g., by five time units.

At this time, the service point is cleared one customer at a time in the program loop, and the result of the clearance (difference between arrival time and customer departure time) is the time each customer spent in the system.