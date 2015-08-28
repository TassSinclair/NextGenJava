package net.sinclairstudios.example;

import net.sinclairstudios.example.s5classes.Coupon;
import net.sinclairstudios.example.s5classes.FlightSegment;
import net.sinclairstudios.example.s5classes.Segment;
import net.sinclairstudios.example.s5classes.Status;

import java.util.Collection;
import java.util.Collections;

public class UsingStreamsInstead {

  public static void main(String... args) {

    getCoupons().stream() // Stream of coupons
        .filter((coupon) -> coupon.getStatus() != Status.Void) // Predicate
        .forEach((coupon) -> // Consumer
        {
          getSegments().stream() // Stream of segments
              .filter(Segment::isFlight) // Predicate
              .map((segment) -> (FlightSegment) segment) // Function
              .filter(coupon::matchesFlightSegment) // Predicate
              .forEach(coupon::addFlightSegment); // Consumer
        });


    String s = String.valueOf(4);

    int length = "pizza".length();

    char charAt = "egg".charAt(1);
  }

  private static Collection<Segment> getSegments() {
    return Collections.emptyList();
  }

  private static Collection<Coupon> getCoupons() {
    return Collections.emptyList();
  }
}
