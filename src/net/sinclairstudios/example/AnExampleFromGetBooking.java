package net.sinclairstudios.example;

import net.sinclairstudios.example.s5classes.Coupon;
import net.sinclairstudios.example.s5classes.FlightSegment;
import net.sinclairstudios.example.s5classes.Segment;
import net.sinclairstudios.example.s5classes.Status;

import java.util.Collection;
import java.util.Collections;

public class AnExampleFromGetBooking {

  public static void main(String... args) {

    for (Coupon coupon : getCoupons())
    {
      if (coupon.getStatus() != Status.Void)
      {
        for (Segment segment : getSegments())
        {
          if (segment.isFlight())
          {
            FlightSegment flightSegment = (FlightSegment) segment;
            if (coupon.matchesFlightSegment(flightSegment))
            {
              coupon.addFlightSegment(flightSegment);
            }
          }
        }
      }
    }
  }

  private static Collection<Segment> getSegments() {
    return Collections.emptyList();
  }

  private static Collection<Coupon> getCoupons() {
    return Collections.emptyList();
  }
}
