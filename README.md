# OpenAPI Definition

- **OpenAPI Version:** 3.1.0
- **API Version:** v0
- **Server URL:** `http://localhost:8082`
- **Description:** Generated server url

---

# Tags

## Channel
Channel operations

---

# Endpoints

## GET `/dailymotion/v1/{id}`

### Summary
Retrieve a channel by its channel id

### Description
Get a `ChannelDTO` object by specifying its channel id.

### Operation ID
`getChannel`

### Parameters

| Name | In | Type | Required | Description | Default |
|------|----|------|----------|-------------|---------|
| `id` | path | string | ✅ | Name of channel to be searched | - |
| `maxVideos` | query | integer (int32) | ❌ | Maximum number of videos to be searched | `10` |
| `maxPages` | query | integer (int32) | ❌ | Maximum number of comments per video to be searched | `2` |

### Responses

#### `200 OK`
**Description:** List of channels

**Content-Type:** `application/json`

Schema:
```json
ChannelDTO
