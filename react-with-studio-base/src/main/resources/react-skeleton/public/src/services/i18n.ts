import i18next from "i18next";
import { initReactI18next } from "react-i18next";

import en from "../locale/en.json";
import nl from "../locale/nl.json";
import fr from "../locale/fr.json";
import de from "../locale/de.json";

const resources = {
  en: {
    translation: {
      ...en,
    },
  },
  nl: {
    translation: {
      ...nl,
    },
  },
  fr: {
    translation: {
      ...fr,
    },
  },
  de: {
    translation: {
      ...de,
    },
  },
};

i18next.use(initReactI18next).init({
  debug: true,
  resources,
  lng: "en",
  interpolation: {
    escapeValue: false,
  },
});
export default i18next;
