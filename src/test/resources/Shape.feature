Feature: Shapes
  I want to make sure I get the correct area

  Scenario Outline: Testing different Rectangles
    Given I am making a Shape
    When the size and type are <size> <type>
    Then Result should be <result>

    Examples:
      | size | type        | result     |
      | 2    | Rectangle   | 4.0        |
      | 5    | Rectangle   | 25.0       |
      | 10   | Rectangle   | 100.0      |

  Scenario Outline: Testing different Circles
    Given I am making a Shape
    When the size and type are <size> <type>
    Then Result should be <result>

    Examples:
      | size | type        | result   |
      | 2    | Circle   | 12.566370614359172     |
      | 5    | Circle   | 78.53981633974483      |
      | 10   | Circle   | 314.1592653589793      |

  Scenario Outline: Testing different Triangles
    Given I am making a Shape
    When the size and type are <size> <type>
    Then Result should be <result>

    Examples:
      | size | type       | result    |
      | 1    | Triangle   | 0.5       |
      | 5    | Triangle   | 12.5      |
      | 10   | Triangle   | 50        |
