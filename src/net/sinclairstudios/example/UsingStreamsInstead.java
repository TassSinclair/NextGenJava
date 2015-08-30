package net.sinclairstudios.example;

import net.sinclairstudios.example.getbooking.Coupon;
import net.sinclairstudios.example.getbooking.FlightSegment;
import net.sinclairstudios.example.getbooking.Segment;
import net.sinclairstudios.example.getbooking.Status;

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
  }

  private static Collection<Segment> getSegments() {
    return Collections.emptyList();
  }

  private static Collection<Coupon> getCoupons() {
    return Collections.emptyList();
  }
}
