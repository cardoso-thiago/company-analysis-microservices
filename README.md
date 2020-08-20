---
title: Mastertech Análise Empresas v1.0
language_tabs:
  - http: HTTP
language_clients:
  - http: ""
toc_footers: []
includes: []
search: false
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="mastertech-an-lise-empresas">Mastertech Análise Empresas v1.0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

# Introdução
API para o sistema de análise de Empresas

# Overview
Sistema de testes criado no curso da Mastertech

Base URLs:

* <a href="http://localhost:8080/cadastro">http://localhost:8080/cadastro</a>

<h1 id="mastertech-an-lise-empresas-misc">Misc</h1>

## Save Company Big Size

<a id="opIdSaveCompanyBigSize"></a>

> Code samples

```http
POST http://localhost:8080/cadastro/empresa HTTP/1.1
Host: localhost:8080
Content-Type: application/json

```

`POST /empresa`

Grava uma uma nova empresa. Deve retornar a empresa salva. Gera no relatório que a empresa é aceita.

> Body parameter

```json
{
  "cnpj": "60.701.190/0001-04"
}
```

<h3 id="save-company-big-size-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[SaveCompanyBigSizeRequest](#schemasavecompanybigsizerequest)|true|none|

<h3 id="save-company-big-size-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_SaveCompanyBigSizeRequest">SaveCompanyBigSizeRequest</h2>
<!-- backwards compatibility -->
<a id="schemasavecompanybigsizerequest"></a>
<a id="schema_SaveCompanyBigSizeRequest"></a>
<a id="tocSsavecompanybigsizerequest"></a>
<a id="tocssavecompanybigsizerequest"></a>

```json
{
  "cnpj": "60.701.190/0001-04"
}

```

SaveCompanyBigSizeRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cnpj|string|true|none|none|

<h2 id="tocS_SaveCompanySmallSizeRequest">SaveCompanySmallSizeRequest</h2>
<!-- backwards compatibility -->
<a id="schemasavecompanysmallsizerequest"></a>
<a id="schema_SaveCompanySmallSizeRequest"></a>
<a id="tocSsavecompanysmallsizerequest"></a>
<a id="tocssavecompanysmallsizerequest"></a>

```json
{
  "cnpj": "21.753.016/0001-45"
}

```

SaveCompanySmallSizeRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cnpj|string|true|none|none|

<h2 id="tocS_SaveCompanyDuplicatedRequest">SaveCompanyDuplicatedRequest</h2>
<!-- backwards compatibility -->
<a id="schemasavecompanyduplicatedrequest"></a>
<a id="schema_SaveCompanyDuplicatedRequest"></a>
<a id="tocSsavecompanyduplicatedrequest"></a>
<a id="tocssavecompanyduplicatedrequest"></a>

```json
{
  "cnpj": "21.753.016/0001-45"
}

```

SaveCompanyDuplicatedRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cnpj|string|true|none|none|

<h2 id="tocS_SaveCompanyWrongCNPJValidationRequest">SaveCompanyWrongCNPJValidationRequest</h2>
<!-- backwards compatibility -->
<a id="schemasavecompanywrongcnpjvalidationrequest"></a>
<a id="schema_SaveCompanyWrongCNPJValidationRequest"></a>
<a id="tocSsavecompanywrongcnpjvalidationrequest"></a>
<a id="tocssavecompanywrongcnpjvalidationrequest"></a>

```json
{
  "cnpj": "X1.753.016/0001-45"
}

```

SaveCompanyWrongCNPJValidationRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|cnpj|string|true|none|none|

