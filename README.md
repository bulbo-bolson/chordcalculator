# chordcalculator

Simple tool to calculate chords given a musical scale

## Examples:

- Using the CLI:
  - C Mayor (Jonian) scale:
  ```
  $ java ChordCalculator "C" "D" "E" "F" "G" "A" "B"
  [C-E-G-B, D-F-A-C, E-G-B-D, F-A-C-E, G-B-D-F, A-C-E-G, B-D-F-A]
  ```
  - C Minor Pentatonic scale:
  ```
  $ java ChordCalculator "C" "Eb" "F" "G" "Bb"
  [C-F-Bb-Eb, G-C-F-Bb, Eb-G-C-F, Bb-Eb-G-C, F-Bb-Eb-G]
  ```

