# OpenAPI Definition

## General Information

| Field | Value |
|---|---|
| OpenAPI Version | `3.1.0` |
| Title | `OpenAPI definition` |
| Version | `v0` |

---

# Servers

| URL | Description |
|---|---|
| `http://localhost:8082` | Generated server url |

---

# Tags

## Channel
Channel operations

---

# Endpoints

## GET `/dailymotion/v1/{channelId}`

### Summary
Retrieve a channel by its channel id

### Description
Get a `ChannelDTO` object by specifying its channel id.

### Operation ID
`getChannel`

### Parameters

| Name | In | Type | Required | Description | Default | Example |
|---|---|---|---|---|---|---|
| `channelId` | `path` | `string` | ✅ | Name of channel to be searched | - | - |
| `maxVideos` | `query` | `integer (int32)` | ❌ | Maximum number of videos to be searched | `10` | `1` |
| `maxPages` | `query` | `integer (int32)` | ❌ | Maximum number of pages per request to be searched | `2` | - |

### Responses

---

#### `200 OK`

**Description:** List of channels

**Content-Type:** `application/json`

##### Schema

```json
{
  "$ref": "#/components/schemas/ChannelDTO"
}
```

##### Example Response

```json
{
  "id": "x4yq48o",
  "name": "Pasion SD",
  "description": "",
  "createdTime": "2026-04-25T23:59:47Z",
  "videos": [
    {
      "id": "xa8nv0g",
      "name": "Hidden Companionship | HD 1080p",
      "description": "Hidden Companionship - Serie completa en español.",
      "releaseTime": "2026-05-08T22:36:17Z",
      "user": {
        "id": null,
        "name": "PasionSD",
        "user_link": "https://www.dailymotion.com/PasionSD",
        "picture_link": "https://s2.dmcdn.net/d/5000002HraHpp/720x720"
      },
      "comments": [
        {
          "id": "656d498a-4913-43ba-9fff-ed3cbc6d94c2",
          "text": "hidden companionship",
          "createdOn": "2026-05-08T22:36:17Z"
        },
        {
          "id": "d25627e7-3f07-4715-99ae-edee495416b4",
          "text": "drama español",
          "createdOn": "2026-05-08T22:36:17Z"
        }
      ],
      "captions": [
        {
          "id": "xa8nv0g.es",
          "link": "https://static2.dmcdn.net/.../subtitle_es.srt",
          "language": "es"
        }
      ]
    }
  ]
}
```

---

#### `404 Not Found`

**Description:** ❌ **Channel not found**

---

## POST `/dailymotion/v1/{id}`

### Summary
Save a channel by its channel id

### Description
Post a `ChannelDTO` object to VideoMiner by specifying its channel id.

### Operation ID
`postChannel`

### Parameters

| Name | In | Type | Required | Description | Default |
|---|---|---|---|---|---|
| `id` | `path` | `string` | ✅ | Name of channel to be created | - |
| `maxVideos` | `query` | `integer (int32)` | ❌ | Maximum number of videos to be included | `10` |
| `maxPages` | `query` | `integer (int32)` | ❌ | Maximum number of pages per request to be included | `2` |

### Responses

---

#### `201 Created`

**Description:** Channel successfully created

**Content-Type:** `application/json`

##### Schema

```json
{
  "$ref": "#/components/schemas/ChannelDTO"
}
```

---

#### `500 Internal Server Error`

**Description:**  
The sent channel object was incorrectly formed. Usually caused by a non existing channel name.

---

# Components

# Schemas

---

## `CaptionPropertiesDTO`

```json
{
  "type": "object",
  "properties": {
    "id": {
      "type": "string"
    },
    "link": {
      "type": "string"
    },
    "language": {
      "type": "string"
    }
  }
}
```

---

## `ChannelDTO`

```json
{
  "type": "object",
  "properties": {
    "id": {
      "type": "string"
    },
    "name": {
      "type": "string"
    },
    "description": {
      "type": "string"
    },
    "createdTime": {
      "type": "string"
    },
    "videos": {
      "type": "array",
      "items": {
        "$ref": "#/components/schemas/VideoDTO"
      }
    }
  }
}
```

---

## `CommentDTO`

```json
{
  "type": "object",
  "properties": {
    "id": {
      "type": "string"
    },
    "text": {
      "type": "string"
    },
    "createdOn": {
      "type": "string"
    }
  }
}
```

---

## `UserDTO`

```json
{
  "type": "object",
  "properties": {
    "id": {
      "type": "string"
    },
    "name": {
      "type": "string"
    },
    "user_link": {
      "type": "string"
    },
    "picture_link": {
      "type": "string"
    }
  }
}
```

---

## `VideoDTO`

```json
{
  "type": "object",
  "properties": {
    "id": {
      "type": "string"
    },
    "name": {
      "type": "string"
    },
    "description": {
      "type": "string"
    },
    "releaseTime": {
      "type": "string"
    },
    "user": {
      "$ref": "#/components/schemas/UserDTO"
    },
    "comments": {
      "type": "array",
      "items": {
        "$ref": "#/components/schemas/CommentDTO"
      }
    },
    "captions": {
      "type": "array",
      "items": {
        "$ref": "#/components/schemas/CaptionPropertiesDTO"
      }
    }
  }
}
```
