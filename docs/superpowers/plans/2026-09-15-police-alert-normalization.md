# Police alert normalization

## Goal

Make Waze enforcement alerts render reliably in Highway Radar by converting Waze RT police and camera subtype names into Highway Radar's canonical SABRE police types.

## Change

- Normalize `POLICE_HIDING` to `POLICE_HIDDEN`.
- Normalize `POLICE_WITH_MOBILE_CAMERA` to `POLICE_HIDDEN`.
- Normalize top-level `CAMERA` alerts to `POLICE_HIDDEN`.
- Normalize ordinary police alerts to `POLICE_VISIBLE`.
- Keep existing hazard and accident pass-through behavior unchanged.

## Regression coverage

`PoliceAlertNormalizationTest` verifies hidden police, mobile camera, visible police, and top-level camera handling.
