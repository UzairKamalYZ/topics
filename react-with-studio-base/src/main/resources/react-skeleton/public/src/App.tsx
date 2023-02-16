import { useState, useEffect } from "react";
import { Routes, Route, Link } from "react-router-dom";

import { useTranslation } from "react-i18next";
import styled from "styled-components";

import { Button } from "@techfix/common";

import Layout from "./Layout";

const LocaleButton = styled.button<{ selected: boolean }>`
  background-color: ${(p) => (p.selected ? "red" : "white")};
`;

const Row = styled.div`
  padding: 1rem;
`;

const PaddedButton = styled(Button)`
  margin: 0.2rem;
`;

function App() {
  const { t, i18n } = useTranslation();
  const [language, setLanguage] = useState(i18n.language);

  useEffect(() => {
    document.title = t("common.title");
  }, []);

  const updateLocale = (locale) => {
    setLanguage(locale);
    i18n.changeLanguage(locale);

    localStorage.setItem("locale", locale);
  };

  return (
    <Layout>
      <LocaleButton
        selected={language === "nl"}
        onClick={() => updateLocale("nl")}
      >
        NL
      </LocaleButton>
      <LocaleButton
        selected={language === "fr"}
        onClick={() => updateLocale("fr")}
      >
        FR
      </LocaleButton>
      <Row>
        <Link to="/">
          <PaddedButton text="home" />
        </Link>
        <Link to="/help">
          <PaddedButton text="Help" />
        </Link>
      </Row>
      <Routes>
        <Route path="/" element={<p>Root</p>} />
        <Route path="/help" element={<p>{t("common.example.needHelp")}</p>} />
      </Routes>
    </Layout>
  );
}

export default App;
