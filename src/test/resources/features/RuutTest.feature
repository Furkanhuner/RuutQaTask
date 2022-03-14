Feature: RuutTest

  @SURUCU
  Scenario: Apply Tabs Checks Surucu
    Given User try to open defined Url
    And User try to click apply button
    And User try to click button and checks message
      | button | message                                                               |
      | SURUCU | Sürücüler, Ruut akıllı ekranlarını takarak ekstra gelir elde ederler. |

  @MOTORCU
  Scenario: Apply Tabs Checks Motorcu
    Given User try to open defined Url
    And User try to click apply button
    And User try to click button and checks message
      | button  | message                                                                |
      | MOTORCU | Motorcular, Ruut akıllı ekranlarını takarak ekstra gelir elde ederler. |

  @REKLAMCI
  Scenario: Apply Tabs Checks Reklamcı
    Given User try to open defined Url
    And User try to click apply button
    And User try to click button and checks message
      | button   | message                                                                                     |
      | REKLAMCI | Markalar ve ajanslar, Ruut akıllı ekranları ile açık havada ölçümlenebilir reklam verirler. |

  @EKRANYATIRIMCISI
  Scenario: Apply Tabs Checks Ekran Yatırımcısı
    Given User try to open defined Url
    And User try to click apply button
    And User try to click button and checks message
      | button           | message                                                                                     |
      | EKRANYATIRIMCISI | Bireyler ve kurumlar, Ruut akıllı ekranlarını satın alarak aylık ekstra gelir elde ederler. |