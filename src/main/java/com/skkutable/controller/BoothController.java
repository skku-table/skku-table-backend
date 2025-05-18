package com.skkutable.controller;

import com.skkutable.domain.Booth;
import com.skkutable.domain.Festival;
import com.skkutable.dto.BoothDto;
import com.skkutable.service.BoothService;
import com.skkutable.service.FestivalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class BoothController {

  private final BoothService boothService;
  private final FestivalService festivalService;

  public BoothController(BoothService boothService, FestivalService festivalService) {
    this.boothService = boothService;
    this.festivalService = festivalService;
  }

  @PostMapping("/booths/register")
  @ResponseBody
  public Booth registerBooth(@RequestBody BoothDto boothDto) {
    Long festivalId = boothDto.getFestivalId();
    Festival festival = festivalService.findFestivalById(festivalId)
        .orElseThrow((() -> new IllegalArgumentException("Festival not found with id: " + festivalId)));


    Booth booth = new Booth(
        festival,
        boothDto.getName(),
        boothDto.getHost(),
        boothDto.getLocation(),
        boothDto.getDescription(),
        boothDto.getStartDateTime(),
        boothDto.getEndDateTime(),
        boothDto.getLikeCount(),
        boothDto.getPosterImageUrl(),
        boothDto.getEventImageUrl()
    );
    return boothService.createBooth(booth);
  }

  @PostMapping("/festivals/{festivalId}/booths/register")
  @ResponseBody
  public Booth registerBooth(@PathVariable Long festivalId, @RequestBody BoothDto boothDto) {
    Festival festival = festivalService.findFestivalById(festivalId)
            .orElseThrow(() -> new IllegalArgumentException("Festival not found with id: " + festivalId));

    Booth booth = new Booth(
            festival,
            boothDto.getName(),
            boothDto.getHost(),
            boothDto.getLocation(),
            boothDto.getDescription(),
            boothDto.getStartDateTime(),
            boothDto.getEndDateTime(),
            boothDto.getLikeCount(),
            boothDto.getPosterImageUrl(),
            boothDto.getEventImageUrl()
    );
    return boothService.createBooth(booth);
  }
}
