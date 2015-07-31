package net.sinclairstudios.example;

import net.sinclairstudios.example.s5classes.Coupon;
import net.sinclairstudios.example.s5classes.FlightSegment;
import net.sinclairstudios.example.s5classes.Segment;
import net.sinclairstudios.example.s5classes.Status;

import java.util.ArrayList;
import java.util.Collection;

public class S9UsingStreamsInstead {

  public static void main(String... args) {

    Collection<Coupon> coupons = new ArrayList<>();
    Collection<Segment> segments = new ArrayList<>();

    coupons.stream() // Stream of coupons
        .filter((coupon) -> coupon.getStatus() != Status.VoidCp) // Predicate
        .forEach((coupon) -> // Consumer
        {
          segments.stream() // Stream of segments
              .filter(Segment::isFlight) // Predicate
              .map((segment) -> (FlightSegment) segment) // Function
              .filter(coupon::matchesFlightSegment) // Predicate
              .forEach(coupon::addFlightSegment); // Consumer
        });

  }
}
