<script>
export default {
  name: 'Calendar'
}
</script>

<template>
  <div class="demo-collapse">
    <el-collapse accordion>
      <el-collapse-item>
        <template #title>
          <strong>日历</strong><el-icon class="header-icon">
          <info-filled />
        </el-icon>
        </template>
        <div>
          <el-calendar>
            <template #date-cell="{ data }">
              <p :class="data.isSelected ? 'is-selected' : ''">
                {{ data.day.split('-').slice(1).join('-') }}
                {{ data.isSelected ? '✔️' : '' }}
              </p>
            </template>
          </el-calendar>
        </div>
      </el-collapse-item>
    </el-collapse>
  </div>
</template>

<style scoped>
.is-selected {
  color: #1989fa;
}
strong {
  float: right;
  font-size: 20px;
  color: purple;
}
</style>